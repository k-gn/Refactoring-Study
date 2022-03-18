package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

// Delegate 패턴은 delegate, 즉 위임자를 갖고 있는 객체가 다른 객체에게 자신의 일을 위임하는 형태의 디자인 패턴
// 사용하는 곳에 위임되서 쓰인다.
// 어떤 일을 해야 하는지를 정해놓기만 하고, 상황에 맞는 코드를 작성하면 된다.
// 코드의 분리를 통해서 다른 클래스에서도 사용이 가능해져 코드의 재사용성이 좋아진다.
// 하나의 파일에 과도하게 쓰여지던 코드를 분리하여 유지보수가 편해진다.
// 인터페이스를 통해 어떤 일을 해야하는지 정해놓았지만 세세한 구현이 조금씩 다르더라도 각 클래스에서 따로 구현을 하고 가져다 쓰는 것은 인터페이스에서 정의한 함수를 가져다 쓰기만 하면 된다.
// 작업을 전달해야 할 경우가 있을 때 처리해야 하는 부분만을 전달할 수 있다.
public class PremiumDelegate {

    private Booking host;

    private PremiumExtra extra;

    public PremiumDelegate(Booking host, PremiumExtra extra) {
        this.host = host;
        this.extra = extra;
    }

    public boolean hasTalkback() {
        return this.host.show.hasOwnProperty("talkback");
    }

    public double extendBasePrice(double result) {
        return Math.round(result + this.extra.getPremiumFee());
    }

    public boolean hasDinner() {
        return this.extra.hasOwnProperty("dinner") && !this.host.isPeakDay();
    }
}
