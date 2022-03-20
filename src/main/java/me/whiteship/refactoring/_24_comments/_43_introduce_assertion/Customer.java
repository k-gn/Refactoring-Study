package me.whiteship.refactoring._24_comments._43_introduce_assertion;

// 주석 리팩토링
// 주석을 남겨야 할 것 같다면 먼저 코드를 리팩토링 할 것 (불필요한 주석을 줄일 수 있다)
// 모든 주석이 나쁘다는 것은 아니며 쓰지 말란 것도 아니다.
// 주석은 좋은 냄새에 해당하기도 한다.

// 어서션 추가하기
// 종종 코드로 표현하지 않았지만 기본적으로 가정하고 있는 조건들이 있다. 그런 조건을 파악하거나 주석을 읽으면서 확인할 수 있다.
// 이런 조건들을 Assertion 을 사용해 명시적으로 나타낼수 있다.
// Assertion 은 if 나 switch 문과 달리 항상 true 이길 기대하는 조건을 표현할 때 사용한다.
// 프로그램이 Assertion에서 실패한다면 프로그래머의 실수로 생각할 수 있다.
// Assertion이 없어도 프로그램이 잘 동작해야한다.
// 특정 부분에선 특정한 상태를 가정하고 있다는 것을 명시적으로 나타낼수 있다.
// 코드를 읽는 사람으로부터 의사소통 용도로 쓰인다.
// 테스트 코드에서 실행 결과 확인 가능
public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        assert discountRate != null && discountRate > 0; // 표현부분
        if(discountRate != null && discountRate > 0) {
            throw new IllegalArgumentException(discountRate + " can't be minus.");
        }
        this.discountRate = discountRate;
    }
}
