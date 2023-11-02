package HW7;

/*

Написать бот, который задет не менее 3-х вопросов (последовательно),

принимает ответы от пользователя и реагирует на эти ответы. Пример: Как вас зовут?

Очень приятно, меня зовут Бот1. Какой у вас вес? 106 кг. А какой рост? А какой возраст? ...

Варианты ответов..., которые отвечает бот.

 */


import java.util.Scanner;


public class RoBot {

    public static void main(String[] args) {

        System.out.println("Меня зовут БОТ_01. Я Ваш виртуальный помощник. \nКак Вас зовут?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.println("Здравствуйте " + name + "! Приятно познакомиться. \nСколько Вам лет?");

        int age = scanner.nextInt();

        System.out.println("Отличный возраст! А какой у Вас рост, " + name + "? \n" +

                "Введите результат в сантиметрах. Например: 165");

        int height = scanner.nextInt();

        System.out.println("А вес?");

        int weight = scanner.nextInt();

        System.out.println("-----------------");

        double index = bmi(age, weight, height);

        //System.out.println("Индекс массы Вашего тела составляет: \n" + index );

        ergebniss(age, index);

        System.out.println("❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗");

        report(index);

        System.out.println("❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗");

        conclusion();



    }



    private static double bmi(int age, double weight, double height) {

        // Индекс Массы Тела рассчитывается по формуле: ИМТ (BMI) = вес (кг) / рост (м)2.

        return weight / ((height / 100) * (height / 100));

    }


    public static void ergebniss(int age, double index) {

        if (age >= 20 && age <= 65) {

            System.out.println("Индекс массы вашего тела состовляет \n" + index);

        } else {

            System.out.println("Индекс массы вашего тела состовляет: \n" + index);

            System.out.println("‼\uFE0F‼\uFE0F‼\uFE0F ВАЖНО! ‼\uFE0F‼\uFE0F‼\uFE0F ");

            System.out.println("Следует отметить, что индекс массы тела рекомендуется рассчитывать для мужчин и женщин \n" +

                    "в возрасте от 20-ти до 65-ти лет. В данном случае полученные результаты могут быть неверными!");

        }

        if (index < 16) {

            System.out.println("У Вас выраженный дефицит массы тела ");

        } else if (index >= 16 && index < 18.5) {

            System.out.println("У Вас недостаточная масса тела (дефицит)");

        } else if (index >= 18.5 && index < 25) {

            System.out.println("Поздравляю!!! У Вас нормальная масса тела!");

        } else if (index >= 25 && index < 30) {

            System.out.println("Внимание!!! Избыточная масса тела (состояние, предшествующее ожирению)!!!");

        } else if (index >= 30 && index < 35) {

            System.out.println("❕❕❕У Вас ожирение 1-й степени❕❕❕");

        } else if (index >= 35 && index < 40) {

            System.out.println("❗❗❗У Вас ожирение 2-й степени❗❗❗");

        } else if (index >= 40) {

            System.out.println("❗Внимание❗Внимание❗Внимание❗Внимание❗");

            System.out.println("‼\uFE0F‼\uFE0F‼\uFE0FОжирение 3-й степени‼\uFE0F‼\uFE0F‼\uFE0F");

        }

    }


    public static void report(double index) {

        System.out.println("В соответствии с рекомендациями ВОЗ используется следующая интерпретация показателей ИМТ:");

        System.out.println("16  и  менее => Выраженный дефицит массы тела");

        System.out.println("16   - 18,5  => Недостаточная масса тела (дефицит)");

        System.out.println("18,5 - 25    => Норма");

        System.out.println("25  -  30    => Избыточная масса тела (состояние, предшествующее ожирению)");

        System.out.println("30  -  35    => Ожирение 1-й степени!!!");

        System.out.println("35  -  40    => Ожирение 2-й степени!!!");

        System.out.println("40  и  более => Ожирение 3-й степени!!!");

    }


    public static void conclusion() {

        System.out.println("Сделайте вывoды. Если Вы у верхней границы нормы, это уже нехорошо. " +

                "\nА если у вас ожиpeние, то скорее предпринимайте меры!!!!!!! " +

                "\nВедь это Ваше здоровье, Ваша жизнь!");

    }

}
