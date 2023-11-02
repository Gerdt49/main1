package practice;

public class ArrayApplication {
    public static void main(String[] args) {

        int[] number = {8, 9, 12, 65, 98, 3, 57, 4, 1, 22};
        ArrayMethod.printArray(number);
        int max  = ArrayMethod.maxArray(number); // для отслеживания максимального значения  в массиве.
        System.out.println("Maximum = " + max );
        int min  = ArrayMethod.minArray(number); //  для отслеживания минимального значения  в массиве.
        System.out.println("Minimum = " + min );
        int maxIndex = ArrayMethod.maxArrayIndex(number); //  для отслеживания максимального значения  индекса в массиве.
        System.out.println("Index of max Element: " + maxIndex);
        int minIndex = ArrayMethod.minArrayIndex(number); // для отслеживания минимального значения  индекса в массиве.
        System.out.println("Index of min Element: " + minIndex);
        ArrayMethod.sortArray(number); //для отслеживания минимального элемента в текущем подмассиве и его индекса.
        ArrayMethod.printArray(number);
        ArrayMethod.sortArrayIntAsc(number);//для отслеживания максимального элемента в текущем подмассиве и его индекса.
        ArrayMethod.printArray(number);
        ArrayMethod.bubbleSort(number); // Пузырьковая сортировка (Bubble Sort). (сравнение элементов списка и меняет их местами)
        ArrayMethod.printArray(number);
        int ranArray = 20;
        int[] randomArray = new int[ranArray];
        ArrayMethod.ArrayRandomInt(randomArray,-10, 10);
        ArrayMethod.split();



        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        ArrayMethod.printArray(digits);


    }

}
