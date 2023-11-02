package practice;
// Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки берутся из корзины до тех пор, пока они там есть. Последнее сообщение:
// "Яблоки кончились!".
public class Apples {
    public static void main(String[] args) {

       int apples = 30;
        int counter = 0;
        int applesInCycle = apples;

        while (applesInCycle > 0 ) {
            System.out.println( "Take one apple from basket");
            applesInCycle = applesInCycle -1;
            counter++;
            System.out.println(" The rest of apples" + applesInCycle);
        }
        System.out.println("The job is done, total 30 apples " + counter + " added in pei from " + apples + " in basket");
    }
}
