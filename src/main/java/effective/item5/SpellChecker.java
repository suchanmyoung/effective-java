package main.java.effective.item5;

import java.util.LinkedList;
import java.util.List;

/**
 * 사용하는 자원에 따라 동작이 달라지는 클래스에는 정적 유틸리티 클래스나 싱글턴 방식이 적합하지 않다.
 * 즉, 클래스가 내부적으로 하나 이상의 자원에 의존하고 자원이 클래스에 동작을 영향을 주는 경우를 말한다.
 * 이 때 인스턴스를 생성할 때 생성자에 필요한 자원을 넘겨주는 방식을 사용하라.
 * 이 패턴의 변형은, 생성자에 자원 팩터리를 넘겨주는 방식이 있다.
 */

public class SpellChecker {
    private final List list;

    public SpellChecker(List list) {
        this.list = new LinkedList();
    }
}
