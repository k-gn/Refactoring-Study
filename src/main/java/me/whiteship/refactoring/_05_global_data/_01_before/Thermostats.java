package me.whiteship.refactoring._05_global_data._01_before;

// 전역 데이터
// 아무곳에서나 변경될 수 있다는 문제가 있다.
// 어떤 코드로 인해 값이 바뀐건지 파악하기 어렵다.
public class Thermostats {

    public static Integer targetTemperature = 70;

    public static Boolean heating = true;

    public static Boolean cooling = false;

    public static Boolean fahrenheit = true;



}
