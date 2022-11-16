package main.java.effective.item17;

/**
 * 변경 가능성을 최소화하라
 * 불변 클래스는 가변 클래스보다 설계하고 구현하고 사용하기 쉬우며, 오류가 생길 여지도 적고 안전하다.
 * 클래스를 불변으로 만들려면 다아래 다섯 가지 규칙을 따른다.
 * 객체의 상태를 변경하는 메서드를 제공하지 않는다.
 * 클래스를 확장할 수 없도록 한다.
 * 모든 필드를 final로 선언한다.
 * 모든 필드를 private으로 선언한다.
 * 자신 이외에는 내부의 가변 컴포넌트에 접근할 수 없도록 한다.
 *
 * 정적 팩토리 메서드로 불변 클래스를 만들면, 상속 등을 방지하고 추가 확장에 용이하다.
 *
 * 다른 합당한 이유가 없다면 모든 필드는 private final 이어야 한다!
 */

public class Complex {
    private final double re;
    private final double im;

    //불변 객체라면 안심하고 공유할 수 있다.
    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    //사칙연산 메서드들이 인스턴스 자신은 수정하지 않고 새로운 Complex 인스턴스를 반환하는 것을 주목하자
    //함수형 프로그래밍이라고 한다
    public Complex plus(Complex complex) {
        return new Complex(re + complex.re, im + complex.im);
    }

    public Complex minus(Complex complex) {
        return new Complex(re - complex.re, im - complex.im);
    }

}
