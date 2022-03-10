package me.whiteship.refactoring._04_long_parameter_list._14_replace_parameter_with_query;

// 매개변수를 질의함수로 바꾸기
// 함수의 매개변수는 짧을수록 이해하기 좋다
// 어떤 매개변수를 다른 매개변수를 통해 알아낼 수 있다면, 중복 매개변수라 할 수 있다.
// 매개변수에 값을 전달하는 것은 함수를 호출하는 쪽 책임이다.
// 가능한 함수를 호출하는 쪽의 책임을 줄이고, 함수 내부에서 책임지도록 노력한다.
// 임시변수를 질의함수로 바꾸기 + 함수선언 변경하기
public class Order {

    private int quantity;

    private double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        double basePrice = this.quantity * this.itemPrice;
        return this.discountedPrice(basePrice);
    }

    private int discountLevel() {
        return this.quantity > 100 ? 2 : 1;
    }

    private double discountedPrice(double basePrice) {
        return discountLevel() == 2 ? basePrice * 0.90 : basePrice * 0.95;
    }
}
