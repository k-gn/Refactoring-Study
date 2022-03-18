package me.whiteship.refactoring._18_middle_man._39_replace_superclass_with_delegate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

// 슈퍼 클래스를 위임으로 바꾸기
// 객체지향에서 상속은 기존의 기능을 재사용하는 쉬우면서 강력한 방법이지만, 때로는 적절하지 않은 경우도 있다.
// 서브 클래스는 슈퍼 클래스의 모든 기능을 지원해야 한다.
// 서브 클래스는 슈퍼 클래스 자리를 대체해도 잘 동작해야 한다.
// 서브 클래스는 슈퍼 클래스의 변경에 취약하다
// 상속은 적절한 경우 매우 효율적인 방법이다. 따라서 먼저 상속을 적용해본 후 적절하지 않다고 판단되면 그때 해당 리펙토링을 적용하면 된다.
public class Scroll { // extends CategoryItem {

    private LocalDate dateLastCleaned;

    private CategoryItem categoryItem; // 위임 - 포함관계

    public Scroll(Integer id, String title, List<String> tags, LocalDate dateLastCleaned) {
//        super(id, title, tags);
        this.dateLastCleaned = dateLastCleaned;
        this.categoryItem = new CategoryItem(id, title, tags);
    }

    public long daysSinceLastCleaning(LocalDate targetDate) {
        return this.dateLastCleaned.until(targetDate, ChronoUnit.DAYS);
    }
}
