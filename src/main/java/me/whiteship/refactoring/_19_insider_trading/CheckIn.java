package me.whiteship.refactoring._19_insider_trading;

// 내부자 거래
// 어떤 모듈이 다른 모듈의 내부 정보를 지나치게 알고 있는 코드 냄새 - 강한 결합도가 생길 수 있다.
// 해결 방법
// - 함수 옮기기 + 필드 옮기기
// - 여러 모듈이 자주 사용하는 공통 기능은 새로운 모듈을 만들거나, 위임 숨기기를 통해 중재자처럼 사용하기
// - 상속으로 인한 결합도는 슈퍼클래스 또는 서브클래스를 위임으로 교체하기
public class CheckIn {

    //    public boolean isFastPass(Ticket ticket) {
//        LocalDate earlyBirdDate = LocalDate.of(2022, 1, 1);
//        return ticket.isPrime() && ticket.getPurchasedDate().isBefore(earlyBirdDate);
//    }
}
