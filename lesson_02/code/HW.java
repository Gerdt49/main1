public class HW {
    public static void main(String[] args) {
        passenger1();

    }

    public static void passenger1 () {
        System.out.println("got on the bus");
        passenger2();
    }

    public static void passenger2 () {
        System.out.println("arrived at the destination");
            passenger3();
    }

    public static void passenger3() {
        System.out.println("got off the bus");
    }

}