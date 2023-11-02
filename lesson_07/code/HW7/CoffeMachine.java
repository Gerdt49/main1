package HW7;

//Написать программу для "Кофе-машины", которая позволяет пользователю выбрать напиток:

// Эспрессо
// Американо
// Латте
// Капучино
// После выбора программа должна сообщить стоимость выбранного напитка.


import java.util.Scanner;


public class CoffeMachine {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Drink name and Price ( Espresso, Americano, Latte, Cappuccino): ");

        String drink = scanner.next();

        switch (drink){
            case "Espresso" -> System.out.println("2,90Euro");
            case "Americano" -> System.out.println("2,50Euro");
            case "Latte" -> System.out.println("2,70Euro");
            case "Cappuccino" -> System.out.println("3,20Euro");
            default -> System.out.println(" Not Available!");
        }
    }
}
