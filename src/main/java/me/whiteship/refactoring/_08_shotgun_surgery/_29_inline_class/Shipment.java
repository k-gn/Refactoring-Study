package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

// 클래스 인라인
// 리펙토릉을 하는 중에 클래스의 책임을 옮기다보면 클래스의 존재 이유가 빈약해지는 경우가 발생할 수 있다.
// 두개의 클래스를 여러 클래스로 나누는 리팩토링을 하는 경우, 먼저 클래스 인라인을 적용해서 두 클래스의 코드를 한 곳에 모으고
// 그 다음 클래스 추출하기를 적용해 새롭게 분리하는 리팩토링을 할 수 있다.
public class Shipment {

    private String shippingCompany;

    private String trackingNumber;

    public Shipment(String shippingCompany, String trackingNumber) {
        this.shippingCompany = shippingCompany;
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingInfo() {
        return this.shippingCompany + ": " + this.trackingNumber;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
