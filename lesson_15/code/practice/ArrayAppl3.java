package practice;

public class ArrayAppl3 {

        public static void main(String[] args) {

            int[] array = {-50, -10, 20, -100, 70, 60, 40, -10, 30, 50};

           ArrayMethod3.printArray(array);
           ArrayMethod3.bubbleSort(array);
           ArrayMethod3.printArray(array);
           ArrayMethod3.split();

           // binarySearch
            int index = ArrayMethod3.binarySearch(array,20);
            System.out.println(index);
            index = ArrayMethod3.binarySearch(array,40);
            System.out.println(index);

            //searchDuplicate
            int count = ArrayMethod3.searchDuplicate(array, -10);
            System.out.println("Duplicates:" + count);


        }
    }
