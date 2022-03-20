package me.whiteship.refactoring.catalog;

public class GuardClauses {

    public int getPoints() {
        // 균형있는 if else 가 아닌 한쪽을 강조해야 하는 경우 => 보호구문으로 바꾸기
        int result;
//        if(isVip()) {
//            result = vipPoint();
//        }else if(isPlat()) {
//            result = platPoint();
//        }else {
//            result = nomalPoint();
//        }
        if(isVip()) return vipPoint();
        if(isPlat()) return platPoint();

        return nomalPoint();
    }

    private int nomalPoint() {
        return 0;
    }

    private int platPoint() {
        return 5;
    }

    private boolean isPlat() {
        return false;
    }

    private int vipPoint() {
        return 10;
    }

    private boolean isVip() {
        return true;
    }
}
