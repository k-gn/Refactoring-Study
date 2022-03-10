package me.whiteship.refactoring._04_long_parameter_list._01_before;

// 긴 매개변수 목록 리펙토링 before
// 매개변수가 많을수록 함수의 역할을 이해하기 어렵다
// 함수가 한가지 일만 하고있는지, 불필요한 매개변수인지, 뭉칠 수 있는 매개변수 목록이 있는지 고려
public class Order {

    private int quantity;

    private double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        double basePrice = this.quantity * this.itemPrice;
        int discountLevel = this.quantity > 100 ? 2 : 1;
        return this.discountedPrice(basePrice, discountLevel);
    }

    private double discountedPrice(double basePrice, int discountLevel) {
        return discountLevel == 2 ? basePrice * 0.9 : basePrice * 0.95;
    }
}
