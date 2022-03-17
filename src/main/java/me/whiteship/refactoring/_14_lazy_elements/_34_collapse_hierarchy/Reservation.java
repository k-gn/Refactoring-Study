package me.whiteship.refactoring._14_lazy_elements._34_collapse_hierarchy;

import java.time.LocalDateTime;
import java.util.List;

// 성의 없는 요소
// 어떤 프로그래밍적인 요소를 만드는 이유
// 1. 나중에 발생할 변화 대비
// 2. 해당 함수나 클래스를 재사용하기 위함
// 3. 의미 있는 이름
// 가끔 이런 요소들이 기대에 부응하지 못하는 경우가 있는데 그런 경우 해당 요소들을 제거해야한다.

// 계층 합치기
// 상속 구조를 리팩토링 하는 중 기능을 올리고 내리다 보면 하위클래스와 상위클래스 코드에 차이가 없는 경우가 발생할 수 있다.
// 이 때 그 둘을 합칠 수 있다. (어떤 것을 없앨 지는 둘 중에 보다 이름이 적절한 쪽을 선택)
public class Reservation {

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private List<String> members;

    private String owner;

    private boolean paid;

}
