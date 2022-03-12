package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;

// 여러 함수를 변환 함수로 묶기
// 관련있는 여러 파생 변수를 만드는 함수가 여러곳에서 만들어지고 사용된다면, 그러한 파생변수를 변환 함수를 통해 모아둘 수 있다.
// 소스 데이터가 변경되지 않는 경우, 변환함수를 사용해 불변 데이터의 필드로 생성 후 재사용할 수도 있다.
// 소스 데이터가 변경될 수 있는 경우 여러 함수를 클래스로 묶기를 사용하는것이 적절하다.
public class Client1 extends ReadingClient {

    double baseCharge;

    public Client1(Reading reading) {
        this.baseCharge = enrichReading(reading).baseCharge();
    }

    public double getBaseCharge() {
        return baseCharge;
    }
}
