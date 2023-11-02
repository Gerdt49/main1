package practice.model.Model.Computer;


public class ComputerAppl {
    public static void main(String[] args) {

        Computer[] shop = new Computer[5];

        System.out.println(shop);

        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 4.5,2.2);
        shop[3] = new Smartphone("Snapdragon", 8, 128, "Samsung", 24, 0.15,123456789098l);

        printArray(shop);
        System.out.println("----------------------------");

       // 1.Computer computer = new Computer("i5", 12, 512, "HP"); // false
        //2.Computer computer = shop[0];
        // 3.boolean checker = shop[0] == computer;

        Computer computer = new Computer("i5", 12, 512, "HP");
        boolean checker = shop[0].equals(computer);
        System.out.println(checker);

        checker = shop[3].equals(computer);
        System.out.println(checker);

        checker = shop[1].equals(shop[2]);
        System.out.println(checker);

        Smartphone smartphone = new Smartphone("Snapdragon", 8, 128, "Samsung", 24, 0.15,1234567);
        checker = smartphone.equals(shop[3]);
    }

        public static void printArray (Computer[]arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) { //   4tobi null ne pe4atalsj
                    System.out.println(arr[i].toString());
                }
            }
        }

    }