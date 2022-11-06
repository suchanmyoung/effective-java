package main.java.effective.item2;

import main.java.effective.item2.NutritionFacts.Builder;

/**
 * 생성자나 정적 팩터리가 처리해야 할 매개변수가 많다면 빌더 패턴을 선택하는 게 더 낫다.
 * 특히 매개변수 중 다수가 필수가 아니라면 더 그렇다.
 * 빌더는 점층적 생성자보다 클라이언트 코드를 읽고 쓰기가 훨씬 간결하며 자바빈즈보다 더 안전하다.
 */
public class Main {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new Builder()
            .servings(5)
            .calories(5)
            .carbohydrate(5)
            .servingSize(5)
            .sodium(5)
            .build();
    }
}
