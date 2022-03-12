package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;

public class ReadingClient {

    protected double taxThreshold(Year year) {
        return 5;
    }

    protected double baseRate(Month month, Year year) {
        return 10;
    }

    // 변환함수를 통해 새로운 레코드를 만들고, 해당레코드에 필드를 추가하여 중복 수식을 제거
    // Reading -> EnrichReading
    protected EnrichReading enrichReading(Reading reading) {
        return new EnrichReading(reading, calculateBaseCharge(reading), calculateTaxableCharge(reading));
    }

    private double calculateBaseCharge(Reading reading) {
        return baseRate(reading.month(), reading.year()) * reading.quantity();
    }

    private double calculateTaxableCharge(Reading reading) {
        return Math.max(0, calculateBaseCharge(reading) - taxThreshold(reading.year()));
    }
}
