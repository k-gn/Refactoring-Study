package me.whiteship.refactoring._05_global_data._17_encapsulate_variable;

// 변수 캡슐화하기
// 데이터 구조를 변경하는 작업을 좀금 더 수월한 메소드 구조 변경 작업으로 대체
// 변수를 직접 접근하기 보다 메소드로 감싸는 작업을 해주면 변경에 유연하게 대처 가능
// 데이터가 사용되는 범위가 클수록 캡슐화를 하는것이 중요
// 불변 데이터일 경우 이런 리팩토링을 적용할 필요가 없다.
public class Thermostats {

    private static Integer targetTemperature = 70;

    private static Boolean heating = true;

    private static Boolean cooling = false;

    private static Boolean readInFahrenheit = true;

    public static Integer getTargetTemperature() {
        return targetTemperature;
    }

    public static void setTargetTemperature(Integer targetTemperature) {
        Thermostats.targetTemperature = targetTemperature;
    }

    public static Boolean getHeating() {
        return heating;
    }

    public static void setHeating(Boolean heating) {
        // TODO validation
        Thermostats.heating = heating;
        // TODO notify
    }

    public static Boolean getCooling() {
        return cooling;
    }

    public static void setCooling(Boolean cooling) {
        Thermostats.cooling = cooling;
    }

    public static Boolean getReadInFahrenheit() {
        return readInFahrenheit;
    }

    public static void setReadInFahrenheit(Boolean readInFahrenheit) {
        Thermostats.readInFahrenheit = readInFahrenheit;
    }
}
