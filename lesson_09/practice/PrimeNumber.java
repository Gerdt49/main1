package practice;

import java.util.Scanner;

//Пользователь вводит натуральное число n. Определите, является ли оно простым.
// Простое число - это такое число, которое делится только на себя и на 1.
 //Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();


        boolean isPrime = true;
        int div = 2;
        while (div < number ){
            if ( number % div == 0 ){
                isPrime = false;
            }
            div++;
        }
        System.out.println(number + " is prime : " + isPrime);
    }
}
