package me.whiteship.refactoring._12_repeated_swtiches;

// 반복되는 switch 문
// 다형성이 꽤 널리 사용되고 있으며, 여러 프로그래밍 언어에서 보다 세련된 형태의 switch 문을 지원하고 있다.
// 반복해서 동일한 switch 문이 존재할 경우, 새로운 조건을 추가하거나, 기존의 조건을 변경할 때 모든 switch 문을 찾아 수정해야 할수도 있다.
public class SwitchImprovements {

    public int vacationHours(String type) {
        int result;
        switch (type) {
            case "full-time": result = 120;
            case "part-time": result = 80;
            case "temporal": result = 32;
            default: result = 0;
        }
        return result;
    }
}
