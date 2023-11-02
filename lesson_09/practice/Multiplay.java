package practice;

// Распечатать в консоли таблицу умножения от 1 до 10.

import java.sql.SQLOutput;

public class Multiplay {
    public static void main(String[] args) {

        int n = 1;
        int m = 1;

        while ( n < 10 ) {
            while (m <= 10 ){
                System.out.print( n + " * " + m + " = " + (n * m) + " | ");
                m++;
            }
            System.out.println();
            m = 1; // sbros b na na4alo
            n++; // n +1


        }

    }
}
