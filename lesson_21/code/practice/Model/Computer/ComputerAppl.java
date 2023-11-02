package practice.Model.Computer;


public class ComputerAppl {
    public static void main(String[] args) {

        double a = 10; // voshod upper
        int b = (int) a; // dolgni ukaz down

        Computer[] shop = new Computer[5];

        System.out.println(shop);

        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone("Snapdragon", 8, 128, "Samsung", 24, 0.15,123456789098l);

        printArray(shop);
        int total = getTotalSSDCapacity(shop);
        System.out.println("Total SSD capacity = " + total);

        int totalssd = getTotalSSDCapacityLaptop(shop);
        System.out.println("Total SSD in Laptop capacity = " + totalssd);

        double totalbattery = gettotalbatteryLaptop(shop);
        System.out.println("Total Battery in Laptop capacity = " + totalbattery);


        Laptop laptop1 = (Laptop) shop[1];
        laptop1.setHours(4.5);
        laptop1.getSsd();
        Laptop laptop2 = (Laptop) shop[1];
        laptop2.setHours(5.5);
        System.out.println(laptop1);
        System.out.println(shop[1]);


        }

        public static void printArray (Computer[]arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) { //   4tobi null ne pe4atalsj
                    System.out.println(arr[i].toString());
                }
            }
        }

        public static int getTotalSSDCapacity (Computer[]arr){
            int res = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    res += arr[i].getSsd(); // res = res +arr[i].getSsd();
                }
            }
            return res;
        }
        // В классе ComputerAppl из классной работы, добавить метод возвращающий общий объем ssd дисков всех Laptop.
        // Обратите внимание, что емкость диска смартфонов считаться не должна. В main распечатать результат работы этого метода.
        public static int getTotalSSDCapacityLaptop(Computer[] arr) {
            int ssdLaptop = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof Laptop && ! (arr[i] instanceof Smartphone)) {
                    ssdLaptop += arr[i].getSsd();
                }
            }
            return ssdLaptop;
    }
        //В классе ComputerAppl из классной работы, добавить метод возвращающий общее время работы батарей всех Laptop.
        //В main распечатать результат работы этого метода.
        public static double gettotalbatteryLaptop (Computer[]arr){
            double totalbatteryLaptop = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof Laptop) {
                    Laptop laptop = (Laptop) arr[i];
                    totalbatteryLaptop += laptop.getHours();
                }
            }
            return totalbatteryLaptop;

        }
    }