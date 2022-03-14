package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.math.BigDecimal;
import java.time.LocalDate;

// 산탄총 수술
// 어떠한 변경 사항이 생겼을 때 여러 모듈을 수정해야 하는 상황
// 변경 사항이 여러곳에 흩어진다면 찾아서 고치기도 어렵고, 중요한 변경사항을 놓칠수 있는 가능성도 생긴다.
// 뒤엉킨 변경은 여러 이유로 한 클래스를 계속 수정해야 한다면, 산탄총 수술은 한가지 이유로 여러곳을 수정하는 것

// 필드 옮기기
// 좋은 데이터 구조를 가지고 있다면, 해당 데이터에 기반한 어떤 행위를 코드로 옮기는 것도 간편하고 단순해진다.
// 처음에는 타당해 보였던 설계적인 의사 결정도 프로그램이 다루고 있는 도메인과 데이터 구조에 대해 더 많이 익혀나가면서 틀린 의사 결정으로 바뀔 수 있다.
// 필드를 옮기는 단서
// - 어떤 데이터를 항상 어떤 레코드와 함께 전달하는 경우
// - 어떤 레코드를 변경할 때 다른 레코드에 있는 필드를 변경해야 하는 경우
// - 여러 레크드에 동일한 필드를 수정해야 하는 경우
public class Customer {

    private String name;

    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.contract = new CustomerContract(dateToday(), discountRate);
    }

    public void becomePreferred() {
        this.contract.setDiscountRate(this.contract.getDiscountRate() + 0.03);
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
        return value.subtract(value.multiply(BigDecimal.valueOf(this.contract.getDiscountRate()))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }
}
