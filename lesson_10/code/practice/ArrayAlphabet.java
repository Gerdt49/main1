package practice;

//Создайте массив и заполните его символами латинского алфавита от A до Z.
// Раcпечатайте полученный массив.
public class ArrayAlphabet {
    public static void main(String[] args) {

        int [] arrayNum = new int[20];

        for (int i = 0; i < arrayNum.length; i++) {

            arrayNum[i] = i + 1;
        }
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ,");

        }
        System.out.println();
        System.out.println("0-qj " + arrayNum[0]);
        System.out.println("19-qj " + arrayNum[19]);

      //  System.out.println("20-qj " + arrayNum[20]);

        char[] alphabet = new char [26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] =  (char) (65 +i);
        }

        for (int i = 0; i < alphabet.length ; i++) {
            System.out.print(alphabet[i] + " ");

        }
    }





    }

