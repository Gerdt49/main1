package practice;
//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
      //  Найдите минимальный элемент массива и его индекс.
      //  Напечатайте все элементы массива с НЕчетными индексами.
      //  Найдите произведение всех четных элементов массива.
public class ArrayExample {

    public static void main(String[] args) {

        int [] array = {75, -250, 34, -15, -123, 57, -145, -250,  86, 77, 48, -59 , -251};

       int m =  minEl0fArray(array); // zna4enie metoda

        System.out.println("min element of array is:  " + m);
        // System.out.println("min element of array is:  " + minEl0fArray(array));

        int i  =  minEl0fArrayIndex(array); // index
        System.out.println("Index of min element of array is: " + i );

    } // ____________array - arr

    public static int minEl0fArrayIndex(int[] array) {
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] <= min ) {  // tekuschij  elemnt massiva array [i]
                min = array[i];
                indexMin = i;

            }

        }
        return indexMin;

    }

    public static int minEl0fArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min ) {  // tekuschij  elemnt massiva array [i]
                min = array[i];
            }

        }
         return min;


    }


    }

