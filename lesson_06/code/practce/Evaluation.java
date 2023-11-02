package practce;

//Родители позволяют ребенку играть на компьютере 1 час.
     //   Напишите программу, которая будет реагировать на полученную в школе оценку:

import java.util.Scanner;

// 1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
      //  2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
      //  3. "Посредственно.", время для игр уменьшается на 30 мин.
      //  4. "Плохо!", сегодня никаких игр на компьютере.
     //   5. "Позор семьи!", никаких игр на компьютере 2 дня.
public class Evaluation {

    public static void main(String[] args) {

        int timeForGame = 60;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input today's mark ");
        int mark = scanner.nextInt();

        switch (mark) {
            case 1: {
                System.out.println("Молодец!");
                timeForGame = timeForGame +30 ;
                System.out.println( "Time for = " + timeForGame + "min.");
                break;
            }
            case 2: {
                System.out.println("Хорошо");
                break;
            }
            case 3: {
                System.out.println("Посредственно.");
                timeForGame = timeForGame -30;
                break;
            }
            case 4 : {
                System.out.println("Плохо!");
                timeForGame = 0;
                break;
            }
            case 5  : {
                System.out.println("Позор семьи!");
                System.out.println("Позор семьи!");
                break;
            }
            default: {
                System.out.println("Wrong input!");
            }

        }



    }
}
