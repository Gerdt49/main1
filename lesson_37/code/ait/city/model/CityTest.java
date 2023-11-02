package ait.city.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);

    }
    private void printArray(Object[]arr, String title){
        System.out.println("...... "+ title + "..........  ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }

    @Test
    void testIntegerDesc(){
        // Создаем массив объектов Integer с тремя значениями: -1, минимальное и максимальное значение типа Integer.
        Integer[] actual = {-1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        // Создаем ожидаемый массив, отсортированный по убыванию: максимальное значение, -1, минимальное значение Integer.
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
        // Сортируем массив actual в порядке убывания с помощью лямбда-выражения и метода Arrays.sort.
        // Лямбда-выражение (n1, n2) -> Integer.compare(n2, n1) сравнивает элементы массива в обратном порядке (по убыванию).
        Arrays.sort(actual, (n1, n2) -> Integer.compare(n2,n1));
        // Проверяем, что отсортированный массив actual совпадает с ожидаемым массивом expected.
        assertArrayEquals(expected, actual);


    }
    @Test
    void testCityComparatable(){
        printArray(cities,"original array");// Выводим исходный массив городов
        Arrays.sort(cities);// Сортируем города в естественном порядке (по имени города)
        printArray(cities,"Natural order"); // Выводим отсортированный массив городов
        // Создаем объект City с именем "null" (возможно, это будет использоваться как шаблон для поиска)
        // и населением 2,700,000 человек
        City pattern = new City(null, 2_700_000);
        int index = Arrays.binarySearch(cities,pattern);// Выполняем двоичный поиск объекта "pattern" в массиве "cities"
        System.out.println("index= " + index); // Выводим индекс, по которому был найден объект "pattern" в массиве "cities"
    }
    @Test
    void testCityNameComparator() {
//      Эта строка создает компаратор, который сравнивает объекты City по их названию.
//      Создание компаратора для сравнения объектов City по названию города
        Comparator<City> comparator =  (c1, c2) -> c1.getName().compareTo(c2.getName());
//      Здесь массив cities сортируется в соответствии с созданным компаратором.
        Arrays.sort(cities,comparator);
//      Этот метод выводит отсортированный массив городов на экран с пометкой "Сортировка по названию".
        printArray(cities,"Sort by name");
//      Создается объект типа City с названием "Chicago" для поиска.
        City pattern = new City("Chicago", 0);
//      Поиск индекса города "Chicago" с помощью двоичного поиска ,
//      Производится двоичный поиск в отсортированном массиве cities для объекта "Chicago".
        int index = Arrays.binarySearch(cities,pattern);
//      Вывод найденного индекса в массиве
//      Найденный индекс элемента "Chicago" выводится на экран.
        System.out.println("index=" + index );
    }
    @Test
    void testArrayCopy() {
        Comparator<City> comparator =  (c1, c2) -> c1.getName().compareTo(c2.getName());
        //City[] citiesCopy = new City [cities.length];
        //for (int i = 0; i < citiesCopy.length; i++) {
       //     citiesCopy[i] = cities[i];}
        //City[] citiesCopy = Arrays.copyOf(cities, cities.length);
        City[] citiesCopy = Arrays.copyOf(cities, cities.length *2);
        printArray(citiesCopy,"CitiesCopy before sort");
       // Arrays.sort(citiesCopy,comparator);
        Arrays.sort(citiesCopy,0,cities.length,comparator);
        printArray(citiesCopy,"CitiesCopy after sort");
       // printArray(cities, "Cities array");
        City pattern  = new City("Yalta",0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comparator);
        System.out.println("index = " + index);
    }
    @Test/**/
    void  testCopyOfRange(){
        City [] citiesCopy = Arrays.copyOfRange(cities,1,cities.length-1);
        printArray(citiesCopy,"copy of range");
    }
    @Test
    void  testSystemArrayCopy(){
        City[] citiesCopy = new City[cities.length * 2];
        System.arraycopy(cities,1,citiesCopy,4,4);
        printArray(citiesCopy, "System.arrayCopy");

    }
    @Test
    void testKeepSorted(){
        Arrays.sort(cities);// Сортировка массива городов в естественном порядке
        printArray(cities,"Natural order");
        City city = new City("Salem",690_000);// Создание нового города Salem
        City[] citiesCopy = Arrays.copyOf(cities,cities.length +1);// Создание копии массива городов с дополнительной ячейкой для нового города
        citiesCopy[citiesCopy.length-1] = city;// Добавление нового города в копию массива
        Arrays.sort(citiesCopy);// Повторная сортировка массива с новым городом
        int index = Arrays.binarySearch(citiesCopy,0, citiesCopy.length -1, city);  // Поиск места для вставки нового города
        // Сдвиг элементов в массиве для освобождения места под новый город
        index= index >= 0 ? index : -index - 1;// Обработка случая, когда город уже существует
        System.arraycopy(citiesCopy,index,citiesCopy,index +1,citiesCopy.length-index-1); // sdvinut
        citiesCopy[index] = city; // Вставка нового города на найденное место
        cities = citiesCopy;// Присвоение отсортированного массива городов исходному массиву
        printArray(cities,"Natural order after add city");
    }
    }
