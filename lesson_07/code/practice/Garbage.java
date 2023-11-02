package practice;

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {

        //  vvod name musora strokoj  , mozet mnogo zna4eniy
        // geltiy bak upakovki paket plastik
        // 4ernij bak - bitov otxodi
        // sinij bak _ bumaga

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input type of garbage : ");
        System.out.println("Package, Plastic, Bag, rest, waste ,papaer, carton ");
        String garbage = scanner.next(); // otwet polzov

        if(garbage.equals("Package")  | garbage.equals("Plastic")  | garbage.equals("Bag")   ){
            System.out.println("Put it into '\n' yellow box");
        } else if (garbage.equals("rest") |  garbage.equals("waste") ) {
            System.out.println("Put");
            } else {
                System.out.println("Put in into blue box");

            }
        }


    }

