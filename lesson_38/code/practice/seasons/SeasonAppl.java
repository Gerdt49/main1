package practice.seasons;

public class SeasonAppl {
    public static void main(String[] args) {
        // Опробовать на нем методы:
        // .values()
        // .toString
        // .ordinal()
        // .valueOf()

        Season[] seasons = Season.values();

        Season s1 = Season.SUM;
        System.out.println(seasons.length);
        System.out.println("............values 1...............");
// for loop
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i].getName());

        }
//        for each
        System.out.println("............values 2...............");
        for ( Season s : seasons) {
            System.out.println(s.getNumber());

        }
        System.out.println("............toString..............");
        String str = Season.WIN.toString();
        System.out.println(str);

        System.out.println("............original()..............");
        int n = Season.AUT.ordinal();
        System.out.println(n);

        System.out.println("............valueOf()..............");
//        Для обратного преобразования (строки в объект `Day`) можно воспользоваться статическим методом `valueOf()`:
        //```java
        //        Day day = Day.valueOf("MONDAY"); // day = Day.MONDAY
        //```
        Season s = Season.valueOf("SUM");
        System.out.println(s.getName() + "- is the best time of the year! ");
    }


}
