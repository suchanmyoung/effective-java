package main.java.effective.item1;

/**
 * 정적 팩토리 메서드(SFM) 장점 생성자와는 달리 이름을 가질 수 있다. 한 클래스에 시그니처가 같은 생성자가 여러 개 필요할 것 같을 때는 생성자를 SFM으로 바꾸자.
 * 호출할 때마다 인스턴스를 생성하지 않아도 된다. 반환 타입의 하위 타입 객체를 반환할 수 있다. 입력 매개변수에 따라 다른 클래스 객체를 반환할 수 있다.
 */

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Date;

/**
 * 정적 팩토리 메서드(SFM) 단점
 * 상속을 사용할 수 없다.
 * 프로그래머삭 찾기 어렵다.
 */

public class StaticFactoryMethod {

    public static void main(String[] args) throws IOException {
        Instant instant = Instant.now();
        Date date = Date.from(instant);

        //같은 인스턴스를 보장하지 않는다.
        StackWalker.getInstance();
        //매번 새로운 인스턴스를 반환함을 보장한다
        New.newInstance();

        //getInstance와 같지만 생성할 클래스가 아닌 다른 클래스에 팩터리리메서드를 정의할 때 쓴다.
        Path path = Path.of("C:");
        //Files의 팩터리메서드지만 FileStore타입을 반환한다.
        FileStore fileStore = Files.getFileStore(path);
    }
}
