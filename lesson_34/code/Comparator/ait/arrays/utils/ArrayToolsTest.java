package Comparator.ait.arrays.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Predicate;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;

    @BeforeEach
    void setUp() {

        arrNum = new Integer[]{9, 7, 4, 2, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four"};
    }

    @Test
    void testPrintArray() {
        System.out.println("..........testPrintArray.........");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);

    }

    @Test
    void testSearch() {
        System.out.println("..........testSearch.........");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrStr, "six");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 4);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 6);
        System.out.println("index = " + index);
    }

    @Test
    void testFindPredicate() {
        System.out.println("===== testFindByPredicate =====");
        // Predicate<Integer> predicate = n -> n < 5;

        Integer num = ArrayTools.findByPredicate(arrNum, n -> n < 5); // элемент, который меньше 5.
        System.out.println(num);
        num = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println(num);
        String str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 4);//найти строку в массиве, длина которой равна 4 символам
        System.out.println(num);
        System.out.println("...........");





    }

    @Test
    void testBubbleSort() {
        System.out.println("===== testBubbleSort =====");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
    }



    @Test
    void testBubbleSortComporator() {
        System.out.println("===== testBubbleSort =====");
        ArrayTools.bubbleSort(arrNum,(n1,n2) -> n1 - n2);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr,(s1,s2) -> s1.length()-s2.length());
        ArrayTools.printArray(arrStr);


        System.out.println("===== Четные целые числа должны идти перед нечетными числами  =====");
        ArrayTools.bubbleSort(arrNum,(n1,n2) -> (n1 % 2 ) - (n2 % 2 ));
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrNum, (n1, n2) -> (n2 % 2) - (n1 % 2)); // Нечетные целые числа перед Четными числами
        ArrayTools.printArray(arrNum);



    }
}


