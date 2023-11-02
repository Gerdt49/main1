package practice.HW_15;

import practice.ArrayMethod3;

//Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
//Реализуйте метод, который получает на вход исходный массив и возвращает массив,
//  содержащий только положительные числа из исходного массива.
public class Track2 {
    public static void main(String[] args) {

        int[] array = new int[20];


        ArrayMethod3.fillArrayRandomInt(array, -100, 100);
        ArrayMethod3.printArray(array);
    }

    public static void reverseArrray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i]; // берем левый элемент во временную переменную
            arr[i] = arr[arr.length - 1 - i]; // переносим правый элемент на место левого
            arr[arr.length - 1 - i] = temp; // место правого ставим тот, что во временной переменной
        }
        System.out.println();

    }

    // ...
    public static int multOfElEvenIndex(int[] arr) {
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // проверяем индекс на четность
                mult *= arr[i];
            }
        }
        return mult;
    }

}





