package practice;

import java.util.Scanner;

//Задайте массив из 10 случайных натуральных чисел в интервале от -20 до 20.
      //  Запросите у пользователя какое-то натуральное число. Определите, есть ли это число в массиве.
      //  Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
       //  а возвращает ответ - нашлось ли это число в массиве.
public class RandomNumbers {
    public static void main(String[] args) {

        int[] randomInt = new int[10];


        int a = -20;
        int b = 20;

        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int) (Math.random() * (b - a + 1) + a);

        }
        for (int i = 0; i < randomInt.length; i++) {
            System.out.print(randomInt[i] + " ");

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println((" Input number ."));

        int num = scanner.nextInt();

        boolean isInArray = searchInArray(randomInt, num);
        if (isInArray) {
            System.out.println("Number " + num + " presents in array ");
        } else {
            System.out.println("Number " + num + " does Not presents in array ");
        }
    }
        public static boolean searchInArray(int[] arr , int n) {

        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  == n ){
             res = true;

            }

        }
        return res ;

    }
}

