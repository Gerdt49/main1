package HW_14;

import practice.ArrayMethod;

public class Track2 {


        public static void main(String[] args) {

            int[] number = {106, -107, 0, 12, 87, -35, 1, 12, 109, 212, 11, 243, 45, -12, 75, 61, 678 ,-56, 87, -11};

            ArrayMethod.printArray(number);
            ArrayMethod.sortArray(number);
            ArrayMethod.printArray(number);
            ArrayMethod.sortArrayIntAsc(number);
            ArrayMethod.printArray(number);
            ArrayMethod.bubbleSort(number);
            ArrayMethod.printArray(number);
            ArrayMethod.split();
        }


        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");

            }
            System.out.println();

        }

        public static int[] sortArray(int[] arr) {

            int min = arr[0];
            int indexMin = 0;
            for (int i = 0; i < arr.length; i++) {
                min = arr[i];
                indexMin = i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        indexMin = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;

            }
            return arr;
        }

    public static int[] sortArrayIntAsc(int[] arr) {
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            indexMax = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    indexMax = j;
                }
            }
            // переставляем минимальный элемент в начало
            int tmp = arr[i];
            arr[i] = arr[indexMax];
            arr[indexMax] = tmp;
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;
                    }
                }
            }
        }

        public static void split() {
            System.out.println(" ---------------------------------- ");
        }

    }
