package me.whiteship.refactoring._06_mutable_data._18_split_variable;

public class Order {

    public double discount(double inputValue, int quantity) {
        double result = inputValue;
        if (inputValue > 50) result -= 2;
        if (quantity > 100) result -= 1;
        return result;
    }
}

// 가변 데이터
// 데이터를 변경하다 보면 예상치 못햇던 결과나 해결하기 어려운 버그가 발생할수 있다.
// 함수형 프로그래밍 언어는 데이터를 변경하지 않고 복사본을 전달한다.
// 하지만 그밖의 프로그래밍 언어는 데이터 변경을 허용하고 있다.
// 따라서 변경되는 데이터 사용 시 발생할 수 있는 리스크를 관리할 수 있는 방법을 적용하는 것이 좋다.