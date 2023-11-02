package practice;

//Имеются оценки абитуриента из его аттестата, всего 20 оценок. Найдите средний балл абитуриента.

public class Abiturient {
    public static void main(String[] args) {

int [] marks = {2, 3, 3, 1, 4, 1, 3, 2, 1, 1, 3, 2};

        int sum0Marks = 0;
        for (int i = 0; i < marks.length ; i++) {
           // sum0Marks = sum0Marks + marks[i];
            sum0Marks += marks[i];
        }
        double avverageMark = (double) sum0Marks / marks.length;


}
}
