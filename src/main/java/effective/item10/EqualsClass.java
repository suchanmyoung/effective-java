package main.java.effective.item10;

/**
 * equals를 재정의하지 않는 상황
 * 각 인스턴스가 본질적으로 고유하다
 * 인스턴스의 논리적 동치성을 검사할 일이 없다
 * 상위 클래스에서 재정의한 equals가 하위 클래스에도 맞는다
 * 클래스가 private 등이라 equals 메서드를 호출할 일이 없다
 */

public class EqualsClass {

    /**
     * equals 메서드는 동치관계를 구현하며 다음을 만족한다.
     * 반사성, 대칭성, 추이성, 일관성, null-아님
     */
}
