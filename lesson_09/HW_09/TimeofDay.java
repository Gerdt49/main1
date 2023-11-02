package HW_09;
//Определение времени суток. Напишите программу, которая принимает текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
import java.util.Scanner;

public class TimeofDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in); // Создаем  Scanner для ввода с клавиатуры

        System.out.print("Введите текущий час (от 0 до 23): "); // Запрашиваем у пользователя текущий час

        int hour = scanner.nextInt();

        scanner.close();  // Закрываем Scanner, так как он больше не нужен

        // Определяем время суток и выводим приветствие

        String greeting = getGreeting(hour);
        System.out.println(greeting);
    }

        // Метод для определения времени суток и формирования приветствия
    public static String getGreeting(int hour) {
        String greeting;

        if (hour >= 0 && hour < 6) { //
            greeting = "Доброй ночи!";
        } else if (hour < 12) {
            greeting = "Доброе утро!";
        } else if (hour < 18) {
            greeting = "Добрый день!";
        } else {
            greeting = "Добрый вечер!";
        }
        return greeting;
    }
}


