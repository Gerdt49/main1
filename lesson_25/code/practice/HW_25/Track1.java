package practice.HW_25;

import java.util.Arrays;

//Задача 1. Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
// Выполнить практикум с этой строкой:
//
//    Распечатать последний символ строки.
//    Найти позицию подстроки “Java” в строке.
//    Проверить, содержит ли заданная строка подстроку “Java”.
//    Заменить все символы “o” на “a”.
//    Преобразуйте строку к верхнему регистру.
//    Преобразуйте строку к нижнему регистру.
//    Вырезать подстроку Java c помощью метода substring().
//    Проверить, заканчивается ли строка подстрокой “!!!”.
//    Проверить, начинается ли строка подстрокой “I'm proud”.
public class Track1 {
    public static void main(String[] args) {

        System.out.println("-----------------------");

        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        char c = str.charAt(str.length() - 1); // Последний символ строки:
        System.out.println("Last symbol of string: " + c);
        System.out.println(str);

        System.out.println("-----------------------");

        int index = str.indexOf('J');
        System.out.println("Index of Java = " + index);
        index = str.indexOf("Java"); // Найти позицию подстроки “Java” в строке.
        System.out.println(index);

        System.out.println("-----------------------");

        String str1 = str.toUpperCase(); //  Преобразуйте строку к верхнему регистру.
        System.out.println(str1);
        System.out.println(str1.toLowerCase()); //Преобразуйте строку к нижнему регистру.

        System.out.println("-----------------------");

        System.out.println(str.substring(10)); // печатаем подстроку с индекса
        System.out.println(str.substring(6,12)); // печатаем подстроку с индекса до индекса
        System.out.println((str.replace("o", "a"))); // Заменить все символы “o” на “a”.

        System.out.println("-----------------------");

        String str2 = "I'm proud to learn Java! Java is the most famous programming language!!!";
        String[] worlds = str2.split( " "); // rasdeljem stroku na elementi massiva tipa String
        System.out.println("Quntity of words in string: " + worlds.length); // dlina massiva
        System.out.println(Arrays.toString(worlds)); // nape4atali

        System.out.println("_____________________________-");

        String str3 = "I'm proud to learn Java! Java is the most famous programming language!!!";
        String[] letters = str3.split(" "); //
        System.out.println("Quntity of letters in string: " + letters.length); // dlina massiva
        System.out.println(Arrays.toString(letters)); //


    }
}
