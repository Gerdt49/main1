package Comparator.ait.arrays;

import Comparator.ait.arrays.utils.ArrayTools;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Proba {


    class ArrayToolsTest {
        Integer[] arrNum;


        @BeforeEach
        void setUp() {

            arrNum = new Integer[]{9, 7, 4, 2, 7, 2, 5, 1, 0};
        }

        @Test
        void testPrintArray() {
            System.out.println("..........testPrintArray.........");
            ArrayTools.printArray(arrNum);
        }

        @Test
        void testBubbleSortComporator() {
            System.out.println("...........Четные целые числа должны идти перед нечетными числами.............");
            ArrayTools.bubbleSort(arrNum, (n1, n2) -> (n1 % 2) - (n2 % 2));
            ArrayTools.printArray(arrNum);
            ArrayTools.bubbleSort(arrNum, (n1, n2) -> (n2 % 2) - (n1 % 2));
            ArrayTools.printArray(arrNum);

        }
    }
}

