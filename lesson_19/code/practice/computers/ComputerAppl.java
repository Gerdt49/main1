package practice.computers;

import practice.computers.model.Computer;
import practice.computers.model.Laptop;

public class ComputerAppl {
    public static void main(String[] args) {

    Computer[] comp = new Computer[3];


        comp[0] = new Computer("i9",16,512,"Assus");
       // System.out.println(comp[0]);

       comp[1] = new Laptop("i5" ,8,256,"Acer", "14", 1000, 2);
       // System.out.println(comp[1]);

        comp[2] = new Laptop("i5" ,8,256,"Apple" ,"15" ,5000, 4);
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i]);
        }

        int sumHdd = 0;
        for (int i = 0; i < comp.length ; i++) {
            sumHdd = sumHdd + comp[i].getHdd();

        }
        int sumRam = 0;
        for (int i = 0; i < comp.length; i++) {
            sumRam = sumRam + comp[i].getRam();

        }


        System.out.println("Total HDD = " + sumHdd);
        System.out.println("Total RAM = " + sumRam); /// Pobeda

    }
}
