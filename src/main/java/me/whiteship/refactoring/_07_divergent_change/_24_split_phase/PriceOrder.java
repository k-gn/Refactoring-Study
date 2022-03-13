package me.whiteship.refactoring._07_divergent_change._24_split_phase;

// 단계 쪼개기
// 서로다른 일을 하는 코드를 각기 다른 모듈로 분리
// 여러일을 하는 함수의 처리과정을 각기 다른 단계로 구분할 수 있다. (ex. 전처리 - 주요작업 - 후처리)
// 서로 다른 데이터를 사용한다면 단계를 나누는데 있어 중요한 단서가 될 수 있다.
// 중간 데이터를 만들어 단계를 구분하고, 매개변수를 줄이는데 활용할 수 있다.
public class PriceOrder {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        final PriceData priceData = calculatePriceData(product, quantity);
        return applyShipping(priceData, shippingMethod);
    }

    private PriceData calculatePriceData(Product product, int quantity) {
        final double basePrice = product.basePrice() * quantity;
        final double discount = Math.max(quantity - product.discountThreshold(), 0)
                * product.basePrice() * product.discountRate();
        return new PriceData(basePrice, discount, quantity);
    }

    private double applyShipping(PriceData priceData, ShippingMethod shippingMethod) {
        final double shippingPerCase = (priceData.basePrice() > shippingMethod.discountThreshold()) ?
                shippingMethod.discountedFee() : shippingMethod.feePerCase();
        final double shippingCost = priceData.quantity() * shippingPerCase;
        return priceData.basePrice() - priceData.discount() + shippingCost;
    }
}
