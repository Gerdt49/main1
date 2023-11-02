package HW_09;

public class VipPreis {

    public static void main(String[] args) {
        int age = 30; // Возраст клиента
        boolean isStudent = false; // Флаг студента (true, если клиент студент)
        boolean isVIP = true; // Флаг VIP-места (true, если клиент выбрал VIP-место)

        double ticketPrice = calculateTicketPrice(age, isStudent, isVIP);
        System.out.println("Стоимость билета: $" + ticketPrice);
    }

    public static double calculateTicketPrice(int age, boolean isStudent, boolean isVIP) {
        double basePrice = 10.0; // Стоимость стандартного билета

        if (age >= 60) {
            // Скидка 25% для пенсионеров
            basePrice *= 0.75;
        } else if (isStudent) {
            // Скидка 10% для студентов
            basePrice *= 0.90;
        }

        if (isVIP) {
            // Доплата 25% за VIP-место
            basePrice *= 1.25;
        }

        return basePrice;
    }
}