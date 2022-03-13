package me.whiteship.refactoring._07_divergent_change._24_split_phase;

// 소프트 웨어는 변경에 유연해야 한다.
// 어떤 모듈이 여러가지 이유로 다양하게 변경되어야 하는 상황
// 서로 다른 문제는 서로다른 모듈에서 해결해야 한다.
// 모듈의 책임이 분리되어 있을 수록 해당 문맥을 더 잘 이해할 수 있고, 다른 문제는 신경쓰지 않아도 된다.
public record Product(double basePrice, double discountThreshold, double discountRate) {

}
