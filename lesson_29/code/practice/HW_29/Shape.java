package practice.HW_29;


 //   Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
// Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//  Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга, один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.


public abstract class Shape {

    protected double side;

    public Shape(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public abstract double calcArea(); //  net tela
    public abstract double calcPerimeter(); // net tela
}
