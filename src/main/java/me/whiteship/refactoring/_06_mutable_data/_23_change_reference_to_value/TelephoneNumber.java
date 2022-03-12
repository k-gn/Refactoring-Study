package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import java.util.Objects;

public record TelephoneNumber(String areaCode, String number) {

    // hashcode 도 반드시 같이 구현해야한다.
    // equals(Object)가 두 객체를 같다고 판단했다면(equals), 두 객체의 hashCode는 똑같은 값을 반환해야 한다.
    // collection 에선 값 비교 시 hashcode 값을 먼저 비교한다.
    // record 에선 자동으로 만들어줘서 아래처럼 만들어줄 필요는 없다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber that = (TelephoneNumber) o;
        return Objects.equals(areaCode, that.areaCode) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }
}
