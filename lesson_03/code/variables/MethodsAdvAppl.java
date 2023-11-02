package variables;

public class MethodsAdvAppl {
    public static void main(String[] args) {

        double constanta  = pi();
        System.out.println(constanta);
        printPi(constanta);
        double res = circleLnght (100);  // radius
        System.out.println("L= " + res);
    }
public  static void printPi(double p){

        System.out.print("Pi = " + p);
}
 public static double circleLnght(double radius) {
        double l = 2 * pi() * radius ;
        return l;
 }

  public static double pi(){  // double  metod
        double pi = 3.1415926;
        return pi;

  }


}
