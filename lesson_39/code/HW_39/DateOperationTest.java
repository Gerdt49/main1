package HW_39;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {

    @BeforeEach
    void setUp() {
        String birthDate = "20-10-1990";
        int age = DateOperation.getAge(birthDate);
        System.out.println("Возраст: " + age + " лет");
    }

    @Test
    void getAge() {
        assertEquals(62, DateOperation.getAge("12/04/1961"));
        assertEquals(61, DateOperation.getAge("1961-12-25"));

    }

    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] expected = {"1970-08-12", " 2000-12-01", "10/12/2000", "2010-10-05"};
        String[] actual = DateOperation.sortStringDates(dates);
        assertArrayEquals(expected, actual);
    }
}
