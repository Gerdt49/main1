package HW_17.Track1;
//Создать класс Cube, описывающий куб cо стороной a.
    //    Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s
     //   (сумма площадей всех граней) и объема v.
     //   Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
      //  Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class Cube {

    //  Cube, описывающий куб cо стороной a.
   int a;

    public Cube(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int perimeter(int a) {
        return 12 * a;
    }

    public int square(int a) {
        return 6 * a * a;
    }

    public int volume(int a) {
        return a * a * a;
    }
}