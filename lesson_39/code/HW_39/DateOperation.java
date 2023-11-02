package HW_39;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateOperation {
    public static int getAge(String birthDate) {
//        LocalDate birthDay = LocalDate.of(1974, 7, 31);
//      LocalDate.of - обеспечивает удобный способ инициализации даты без необходимости использования конструктора напрямую.
//        return birthDay.getYear(); // Возвращаем количество лет
            //TODO
            LocalDate date = LocalDate.parse(birthDate);
            System.out.println(date);
            LocalDate currentDate = LocalDate.now();
            System.out.println(currentDate);
            long age = ChronoUnit.YEARS.between(date, currentDate);
            System.out.println(age);
            int res = (int) age;
            return res;
        }

        public static String[] sortStringDates(String[] dates) {
            //TODO


            return null;
        }
    }



