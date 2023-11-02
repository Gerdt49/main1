public class ArrayFigures {
    //Создайте массив из 20 целых чисел в интервале от 10 до 30. Выведите массив на печать.
   // Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

    public static void main(String[] args) {
        int [] arrayNum = new int[30];

        for (int i = 0; i < arrayNum.length; i++) {

            arrayNum[i] = i + 1;
        }
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ,");

        }
        System.out.println();
        System.out.println("0-qj " + arrayNum[0]);
        System.out.println("19-qj " + arrayNum[19]);

    }
}
