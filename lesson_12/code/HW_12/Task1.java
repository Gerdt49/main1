package HW_12;
// Напишите метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
// Сначала последний элемент, потом предпоследний, и т.д.
// Измените (лучше скопируйте и сделайте еще один метод) метод так, чтобы он работал с массивом,
// заполненном "цифрами прописью": zero, one, two, three, ..., nine
// Выполните "разворот" это массива.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        IntegersNumbers(numbers);
        Stringwords(words);
    }

    public static void IntegersNumbers(int[] numbers) {   // int[] numbers ( числа )
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Перейти на новую строку после печати массива в обратном порядке


    }

    public static void Stringwords(String[] words) { // String [] words ( слова )
        String temp = null;
        for (int i = 0; i < words.length/ 2; i++) {
            temp = words[i]; // берем левый элемент во временную переменную
            words[i] = words[words.length - 1 - i]; // переносим правый элемент на место левого
            words[words.length - 1 - i] = temp; // место правого ставим тот, что во временной переменной
            System.out.print(words[i] + " ");
        }
        System.out.println();

    }
}











