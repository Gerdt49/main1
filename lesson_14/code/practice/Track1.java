package practice;

public class Track1 {

    public static void main(String[] args) {

        int[] number = {97, -10, 114, 65, 89, -3, 75, 12, 106, 213};

        ArrayMethod.printArray(number);
        ArrayMethod.sortArray(number); //для отслеживания минимального элемента в текущем подмассиве и его индекса.
        ArrayMethod.printArray(number);
        ArrayMethod.bubbleSort(number); // Пузырьковая сортировка (Bubble Sort). (сравнение элементов списка и меняет их местами)
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