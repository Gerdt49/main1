package practice.HW_29;

public class Circle extends Shape {

    final double PI = 3.1415;
    public Circle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        double circle = PI * side * side;
        return circle;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = 2 * PI * side;
        return perimeter;
    }
}
