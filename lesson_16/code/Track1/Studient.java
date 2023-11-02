package Track1;



public class Studient {

    private int id; // идентификатор
    private String Name;  // имя
    private String surname ; // фамилия
    private int yearofbirth; // год рождения
    private String specialization; // специализация
    private boolean gender; // пол

    public Studient(int id, String name, String surname, int yearofbirth, String specialization, boolean gender) {
        this.id = id;
        Name = name;
        this.surname = surname;
        this.yearofbirth =yearofbirth;
        this.specialization = specialization;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("ID: " + id + ", name: " + Name + ", surname: "
                + surname + ", yearofbirth: " + yearofbirth + ", specialization: " + specialization  + ",  gender: " + (gender ? "male" : "female"));
    }

    public void study(){ // учиться
        System.out.println("Student to study!...");
    }

    public void takeavacation(){  // взять отпуск
        System.out.println("Student took a leave of absence");
    }

    public void passtheexam(){  // сдать экзамен
        System.out.println("student passed the exam !!!");
    }
}
