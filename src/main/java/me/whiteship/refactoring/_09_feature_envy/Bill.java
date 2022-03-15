package me.whiteship.refactoring._09_feature_envy;

// 기능 편애
// 어떤 모듈에 있는 함수가 다른 모듈에 있는 데이터나 함수를 더 많이 참조하는 경우에 발생한다.
// 그 중 가장 많은 데이터를 참조하는 곳으로 옮기거나, 함수를 여러개로 쪼개서 각 모듈로 분산시킬 수도 있다.
// 데이터와 해당 데이터를 참조하는 행동을 같은곳에 두도록 하기
// 데이터와 행동을 분리한 디자인 패턴을 예외적으로 적용할 수 있다.
public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

//    public double calculateBill() {
//        var electicityBill = electricityUsage.getAmount() * electricityUsage.getPricePerUnit();
//        var gasBill = gasUsage.getAmount() * gasUsage.getPricePerUnit();
//        return electicityBill + gasBill;
//    }

    public double calculateBill() {
        return electricityUsage.getElecticityBill() + gasUsage.getGasBill();
    }

}
