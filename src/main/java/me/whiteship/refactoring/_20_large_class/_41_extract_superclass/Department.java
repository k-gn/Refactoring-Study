package me.whiteship.refactoring._20_large_class._41_extract_superclass;

import java.util.List;

// 거대한 클래스
// 어떤 클래스가 너무 많을 일을 하다보면 필드도 많아지고, 중복 코드도 보이기 시작한다.
// 클라이언트가 해당 클래스가 제공하는 기능 중에 일부만 사용한다면 가각의 세부 기능을 별도의 클래스로 분리할 수 있다.
// - 클래스 추출하기를 사용해 관련 필드를 한곳에 모으기
// - 상속 구조를 만들 수 있다면 슈퍼 클래스 추출하기 또는 타입 코드를 서브클래스로 교체하기를 적용
// 클래스 내부에 산재하는 중복코드는 메소드를 추출하여 제거할 수 있다.

// 슈퍼클래스 추출하기
// 두개의 클래스에서 비슷한것들이 보인다면 상속을 적용하고, 슈퍼클래스로 필드 올리기와 메소드 올리기를 사용한다.
// 대안으로 클래스 추출하기를 적용해 위임을 사용할 수 있다.
// 간단한 상속 적용 후 나중에 필요하다면 슈퍼클래스를 위임으로 교체하기를 적용한다.
public class Department extends Party {

    private List<Employee> staff;

    public Department(String name, List<Employee> staff) {
        super(name);
        this.staff = staff;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    @Override
    public double monthlyCost() {
        return this.staff.stream().mapToDouble(e -> e.monthlyCost()).sum();
    }

    public int headCount() {
        return this.staff.size();
    }
}
