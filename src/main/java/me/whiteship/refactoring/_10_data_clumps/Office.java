package me.whiteship.refactoring._10_data_clumps;

// 데이터 뭉치
// 항상 뭉쳐 다니는 데이터는 한곳으로 모아두는 것이 좋다
// - 여러 클래스에 존재하는 비슷한 필드 목록
// - 여러 함수에 전달하는 매개변수 목록
public class Office {

    private String location;

    private TelephoneNumber officePhoneNumber;

    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
        return this.officePhoneNumber.toString();
    }

}
