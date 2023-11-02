package practice.HW_15;

 //Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
 // Выполните сортировку полученного массива. Попало ли число 0 в этот массив?
 // (выяснить с помощью binary search) Если да, то на какое место (индекс) в массиве?
 //Если нет, то на какой индекс его следует поставить?
import practice.ArrayMethod3;

    public class ArrayApplication3_HW15 {
    public static void main(String[] args) {


        int[] array = new int[20];


        ArrayMethod3.fillArrayRandomInt(array, -100, 100); //  из 20-ти случайных целых чисел из интервала от -100 до 100.
        ArrayMethod3.printArray(array); // печать до сортировки
        ArrayMethod3.sortedSort(array); // сортировка "sortedSort"
        ArrayMethod3.printArray(array); // печать после сортировки

        ArrayMethod3.split();

        int index = ArrayMethod3.binarySearch(array, 111);
        System.out.println(index);
        index = ArrayMethod3.binarySearch(array,-35);
        System.out.println(index);


    }
        public static int[] sortedSort(int[] arr){
            int min = arr[0];
            int indexMin = 0;
            for (int i = 0; i < arr.length; i++) {
                min = arr[i];
                indexMin = i;
                for (int j = i; j < arr.length; j++) {
                    if( arr[j] < min ) {
                        min = arr[j];
                        indexMin = j;
                    }
                }
                // переставляем минимальный элемент в начало
                int tmp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = tmp;
            }
            return arr;
        }
        public static int binarySearch(int[] arr, int num){
            int left = 0;
            int right = arr.length -1;

            while(left <= right ){
                int mid = (left + right ) / 2;
                if(arr[mid] ==  num ){
                    return mid;
                }else if (num < arr[mid]){
                    right = mid -1;
                } else {
                    left = mid + 1;
                }
            }
            return - left -1; // hotim vernut -1; esli elemnt ne najden (otrizatelnoe 4islo)
        }

        public static void fillArrayRandomInt(int[] arr, int a, int b) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random() * (b - a + 1) + a);
            }
        }



        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

}

