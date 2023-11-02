package HW_09;

// Распечатайте все числа меньшие 200 и кратные 13.

public class NumBer1 {
    public static void main(String[] args) {

            int count = 1;

            while (count <= 200) {
                if ( count % 13 == 0 ){
                    System.out.print(count + " | " );
                }

                count++;
            }
        }
    }
