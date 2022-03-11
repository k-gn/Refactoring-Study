package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

// 질의 함수와 변경 함수 분리하기
// 눈에 띄는 사이드 이팩트 없이 값을 조회할 수 있는 메소드는 테스트 하기도 쉽고, 메소드 이동도 편하다.
// 어떤 값을 리턴하는 함수는 사이드 이팩트가 없어야 한다.
// 캐시는 중요한 객체 상태변화가 아니라서, 어떤 메소드 호출로 인해 캐시 데이터를 변경하더라도 분리할 필요는 없다.
public class Billing {

    private Customer customer;

    private EmailGateway emailGateway;

    public Billing(Customer customer, EmailGateway emailGateway) {
        this.customer = customer;
        this.emailGateway = emailGateway;
    }

    // 조회에 해당
    public double getTotalOutstanding() {
        double result = customer.getInvoices().stream()
                .map(Invoice::getAmount)
                .reduce((double) 0, Double::sum);
//        sendBill();
        return result;
    }

    // 변경에 해당
    public void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}
