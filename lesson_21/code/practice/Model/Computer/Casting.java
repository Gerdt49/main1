package practice.Model.Computer;

public class Casting {
    public static void main(String[] args) {


        Computer lap1 = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        System.out.println(lap1);
        // lap1.set ne pokas
        // Laptop laptop1 = lap1;


        if (lap1 instanceof Laptop) {
            Laptop laptop1 = (Laptop) lap1; // down casting from Computer to Laptop
            laptop1.setHours(4.5);
            System.out.println(laptop1);
        }
        System.out.println(lap1);
        Computer smart1 = new Smartphone("Snapdragon", 8, 128, "Samsung", 24,
                0.15, 123456789098l);
        //Smartphone smartphone1 = smart1;

        if (smart1 instanceof Smartphone) {
            Smartphone smartphone1 = (Smartphone) smart1;
            System.out.println(smartphone1.getImei());
        }


         // Smartphone smartphone = (Smartphone) lap1;
        if (lap1 instanceof Smartphone) {
            Smartphone smartphone2 = (Smartphone) lap1;
            System.out.println(smartphone2);
        } else {
            System.out.println("lapl1 not a Smatphone");

        }
    }
}