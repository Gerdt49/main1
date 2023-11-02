package practice;
// Запустить обратный отсчет старта ракеты от 10 до 0. Последнее сообщение: "Поехали!...".
public class Rocket {
    public static void main(String[] args) {

        int countDown = 10;
        System.out.println(" do starta " + countDown);

        while (countDown > 0) {
            countDown--;
            System.out.println("do starta"  + countDown);
        }
        System.out.println("Поехали!..");
    }
}
