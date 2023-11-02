package practice;
         //Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
        //Выведите на печать температуру, которая была во вторник и затем в четверг.
         // Найти среднюю температуру за прошлую неделю.
public class TemTage {
    public static void main(String[] args) {


        double [] tags = new double[] {19.0,19.0,21.0,23.0,15.0,15.0,18.0,20.0}; // Действительная Температура на этой недели в нашем городе.
        System.out.println(" Температура вторникa : "  + tags [1] + " градусов" );
        System.out.println(" Температура четвергa : "  + tags [3] + " градусов" );

        // Вычисляем сумму температур
        double sum = 0;
        for (double temperature : tags) {
            sum += temperature;
        }

        // Вычисляем среднюю температуру
        double weekTemperature = sum / tags.length;

        // Выводим результат
        System.out.println("Средняя температура : " + weekTemperature);
    }
         }


