package HW8;

import java.util.Scanner;

//Программа получает на вход строку и число повторений этой строки.
//Программа должна вывести эту строку нужное количество раз.
public class RepeatString {                      // Repeat String - Повторить строку
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество повторений: ");

        int numberOfrepetitions  = scanner.nextInt(); //  number of repetitions - количество повторений
        int counter = 0;                              //   counter - счетчик

        while (counter < numberOfrepetitions) {
            System.out.println("Получилось ");
            counter++;
        }
    }
}
