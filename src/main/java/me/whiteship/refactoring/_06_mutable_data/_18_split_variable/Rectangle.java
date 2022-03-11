package me.whiteship.refactoring._06_mutable_data._18_split_variable;

// 변수 쪼개기
// 어떤 변수가 여러번 재할당 되어도 적절한 경우
// 반복문에서 순회하는데 사용되는 변수 / 값을 축적시키는데 사용되는 변수 등
// 그밖에 재할당되는 변수가 있다면 해당 변수는 여러 용도로 사용되는 것이며, 변수를 분리해야 더 이해하기 좋다.
// 변수 하나당 하나의 책임, 상수(fianl) 활용할 것
public class Rectangle {

    private double perimeter;
    private double area;

    public void updateGeometry(double height, double width) {
        final double perimeter = 2 * (height + width);
        System.out.println("Perimeter: " + perimeter);
        this.perimeter = perimeter;

        final double area = height * width;
        System.out.println("Area: " + area);
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
