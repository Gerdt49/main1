package HW6;
///Задание 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.



import java.util.Scanner;

public class AppiForCalculatingForLeght {
    public static void main(String[] args) {


        double baseSalary = 500;  // базовая зарплата

        double bonusesForlength3 = 0.1; // надбавка за стаж
        double bonusesForlength5 = 0.5;
        double bonusesForlength10 = 1.0;
        double bonusesForlength15 = 1.5;


        Scanner scanner = new Scanner(System.in);// включили ввод данных с клавиатуры
        System.out.println("Input your work experience: ");
        double Salary = scanner.nextInt();

        switch ((int) Salary) {
            case 3, 4: {
                System.out.println("Thanks for your work.");
                Salary = (baseSalary + (baseSalary * bonusesForlength3) * 12);
                System.out.println("Your bonus is = " + Salary + " dollars.");
                break;
            }
            case 5, 6, 7, 8, 9: {
                System.out.println("Thanks for your work.");
                Salary = (baseSalary + (baseSalary * bonusesForlength5) * 12);

                System.out.println("Your bonus is = " + Salary + " dollars.");
                break;
            }
            case 11, 12, 13, 14: {
                System.out.println("Thanks for your work.");
                Salary = (baseSalary + (baseSalary * bonusesForlength10) * 12);

                System.out.println("Your bonus is = " + Salary + " dollars.");
                break;

            }
            case (15): {
                System.out.println("Thanks for your work.");
                Salary = (baseSalary + (baseSalary * bonusesForlength15) * 12);

                System.out.println("Your bonus is = " + Salary + " dollars.");
                break;
            }
            default: {
                System.out.println("Wrong input!");

            }
        }
    }

}