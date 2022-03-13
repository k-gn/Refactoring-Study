package me.whiteship.refactoring._07_divergent_change._25_move_function;

public class AccountType {
    private boolean premium;

    public AccountType(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return this.premium;
    }

    // account 를 받는 것보다 값을 받는게 더 좋음 (낮은 의존성)
    // account 를 받아야 하는 상황이라면 account 클래스 내에 작성하는게 더 좋다.
    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            final int baseCharge = 10;
            if (daysOverdrawn <= 7) {
                return baseCharge;
            } else {
                return baseCharge + (daysOverdrawn - 7) * 0.85;
            }
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}