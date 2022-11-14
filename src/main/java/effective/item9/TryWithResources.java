package main.java.effective.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) throws IOException {
        //더 이상 자원을 회수하는 최선의 방책이 아니다.
        //예외는 try 블록과 finally 블록 모두에서 발생할 수 있기 때문에 close 메소드도 실패할 수 있다.
        //스택 트레이스를 확인하면 두 번째 예외(close)에서 터진 예외만 확인되어 디버깅도 어렵다.
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/"));
        try {
            bufferedReader.readLine();
        } finally {
            bufferedReader.close();
        }

        //try with resources 방식에서 예외가 터지면 readLine 예외가 기록된다.
        //close(내부 구현에 있는)에서 발생한 예외는 suppressed 로 기록된다.
        try (BufferedReader br = new BufferedReader(new FileReader("/"))) {
            br.readLine();
        }
    }

}
