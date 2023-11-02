public class HW_10 {
    public static void main(String[] args) {

                int[] arrayChange = new int[20];
                int a = arrayChange[0];
                arrayChange[0]=10;

                for (int i = 0; i < arrayChange.length; i++) {
                    arrayChange[i] = i + 1;
                    System.out.print(arrayChange[i] + " ");
                }
                System.out.println();

                arrayChange[0] = arrayChange[19];
                arrayChange[19] = a;
                for (int i = 0; i < arrayChange.length; i++)
                {
                    System.out.print(arrayChange[i] + " ");
                }

            }
        }

