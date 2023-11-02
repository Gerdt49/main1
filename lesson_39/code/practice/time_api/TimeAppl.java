package practice.time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

public class TimeAppl {
    public static void main(String[] args) {

//          **Работа с датами:**
//        - узнать текущую дату и время
//        - есть дата, какой это был день недели? день месяца? день года?
//        - есть дата, как узнать, это было раньше? или позже?
//
//          **Путешествие во времени**
//        - в будущее currentDay.plus
//        - в прошлое currentDay.minus
//        - использование ChronoUnit
//
//          **Получение интервала времени**
//
//          **Сортировка массива по времени**
//
//         **Date Formatter**
//
//          **Парсинг даты из строки**

        LocalDate currentDay = LocalDate.now();
        System.out.println(currentDay);

        LocalTime currenTime = LocalTime.now();
        System.out.println(currenTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate gagarin = LocalDate.of(1961,4,12);
        System.out.println(gagarin.getYear());
        System.out.println(gagarin.getDayOfYear());
        System.out.println("Start Gagarin day of week :" + gagarin.getDayOfWeek());

        System.out.println(gagarin.isBefore(currentDay));
        System.out.println(gagarin.isAfter(currentDay));

        System.out.println("............Traveling in Time .............");
        LocalDate newDate = currentDay.plusDays(50);
        System.out.println(newDate);

        newDate = currentDay.plusWeeks(12);
        System.out.println(newDate);

//        2 month ago
        newDate = currentDay.minusMonths(2);
        System.out.println("Twi month ago: " + newDate);

//        operations with chronounits , операции с хроноединицами
        System.out.println(localDateTime.plus(9, ChronoUnit.HALF_DAYS));

//        CENTURE _ 100 years
        newDate = currentDay.plus(2,ChronoUnit.CENTURIES);
        System.out.println(("In 2 centrus:" + newDate));
        System.out.println("It will be day of week :" + newDate.getDayOfWeek());

//  skolko let proschlo? sklko let persone?
        LocalDate einstain = LocalDate.of(1879,3,14);
        long res = ChronoUnit.YEARS.between(einstain,gagarin);
        System.out.println(res);


        System.out.println("Compare dates");
        System.out.println(einstain.compareTo(gagarin));
        LocalDate yesteroday = LocalDate.of(2023,10,30);
        System.out.println(currentDay.compareTo(yesteroday));

//         SORTING TIME
        LocalDate[] dates = {yesteroday, einstain,gagarin,currentDay};
        System.out.println(Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));
    }
}
