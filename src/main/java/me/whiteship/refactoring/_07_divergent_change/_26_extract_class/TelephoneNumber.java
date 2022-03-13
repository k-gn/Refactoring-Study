package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class TelephoneNumber {
    
    // 클래스를 옮길 때, 이름이 적절한지 다시한번 고려해보자
    private String areaCode;
    private String number;

    public TelephoneNumber(String officeAreaCode, String officeNumber) {
        this.areaCode = officeAreaCode;
        this.number = officeNumber;
    }

    public String areaCode() {
        return areaCode;
    }

    public void setAreaCode(String officeAreaCode) {
        this.areaCode = officeAreaCode;
    }

    public String number() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String telephoneNumber() {
        return this.areaCode + " " + this.number;
    }
}