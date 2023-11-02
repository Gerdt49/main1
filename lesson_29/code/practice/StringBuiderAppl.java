package practice;

public class StringBuiderAppl {
    public static void main(String[] args) {

        // StringBuilder - eto klass s metodami


        String str = "Java";

        // str  = str + "_" + 11
        str = str.concat("_"); // concat ckleivanie
        str = str.concat("" + 11); // "" pustaj stroka (+  primitiv int)
        System.out.println(str);

        // StringBuilder - nutable!
        StringBuilder sb = new StringBuilder("Java");
        sb.append("_").append(11);  // append _dobavlenie
        System.out.println(sb); // sb - mutiruet

        sb.reverse(); // stroka zadom na pered
        System.out.println(sb);

        // mozno li vernut tip StringBuilder obratno v String?
        str = sb.toString();  // da, mozno
        System.out.println(str);








    }
}
