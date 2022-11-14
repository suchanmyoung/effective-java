package main.java.effective.item6;

/**
 * 요즘의 JVM에서는 별다른 일을 하지 않는 작은 객체를 생성하고 회수하는 일이 크게 부담되지 않는다.
 * 프로그램의 명확성, 간결성, 기능을 위해서 객체를 추가로 생성하는 것이라면 일반적으로 좋은 일이다.
 */
public class StringClass {
    public static void main(String[] args) {
        String s = "bikini";
        String a = "bikini";

        // 같은 가상 머신 안에서 똑같은 문자열 리터럴을 사용하는 모든 코드가 같은 객체를 재사용함을 보장한다.
        System.out.println(s == a);

        // 오토박싱을 주의하라!
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
    }
}
