package Track1;

public class StudientAppl {
    public static void main(String[] args) {

        Studient std1 = new Studient(1,"Michael","Oskar",1983,"Studient", true);

        std1.display();

        std1.study();
        std1.takeavacation();
        std1.passtheexam();
    }

}
