package me.whiteship.refactoring._15_speculative_generality._35_remove_dead_code;

import java.time.LocalDateTime;

// 추측성 일반화
// 나중에 이런저런 기능이 생길 것으로 예상해서 여러 경우에 필요로 할만한 기능을 만들어 놨지만 결국 쓰이지 않는 코드가 발생할 경우
// You are not gonna need it

// 죽은 코드 제거하기
// 사용하지 않는 코드가 성능이나 기능에 영향을 끼치지는 않지만, 동작을 이해하는데 어려울 수 있다
// 테스트 코드에서만 참조하고 있을 경우도 해당
// inlay 설정으로 어디서 쓰이는지 확인 가능
// 지워도 나중에 git 과 같은 버전관리 시스템으로 복원할 수 있다.
public class Reservation {

    private String title;

    private LocalDateTime from;

    private LocalDateTime to;

    private LocalDateTime alarm;

    public Reservation(String title, LocalDateTime from, LocalDateTime to) {
        this.title = title;
        this.from = from;
        this.to = to;
    }

    public void setAlarmBefore(int minutes) {
        this.alarm = this.from.minusMinutes(minutes);
    }

    public LocalDateTime getAlarm() {
        return alarm;
    }
}
