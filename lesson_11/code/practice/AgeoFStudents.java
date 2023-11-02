package practice;
//Создайте массив, который содержит возраст студентов группы.

        //какой возраст максимальный?
       // какой возраст минимальный?
       // есть ли однокурсники с одинаковым возрастом? Если да, то сколько студентов, у которых одинаковый возраст?

public class AgeoFStudents {
    public static void main(String[] args) {
        int[] age0fStudent = {38, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36, 45, 47, 34};

        int max = age0fStudent[0];
        int indexMax = 0;

        for (int i = 0; i < age0fStudent.length; i++) {
            if(age0fStudent[i] > max ){
                max = age0fStudent[i];
                indexMax = i;
            }

        }
        System.out.println("Max age:" + max);
        System.out.println("Index of max element : " + indexMax);

         int  min = age0fStudent[0];
        int indexMin  = 0;

        for (int i = 0; i < age0fStudent.length; i++) {
            if(age0fStudent[i] < min ){
                min = age0fStudent[i];
                indexMin = i;

            }
        }
        System.out.println("Min age:" + min);
        System.out.println("Index of min element: " + indexMin);

        int duplicate = age0fStudent[0]; // dublikat
        int dCount =0; // s4et4ik
        int index = 0;

        for (int i = 0; i < age0fStudent.length; i++) {
            for (int j = i +1; j < age0fStudent.length; j++) {
                if(age0fStudent[i] == age0fStudent[j]){
                    duplicate =  age0fStudent[i];
                    dCount++;
                    index = j;
                    System.out.println("Duplicate : " + duplicate + " index:  " + index);
                    System.out.println("Quality of  : " + dCount);

                }

            }

        }

    }
}
