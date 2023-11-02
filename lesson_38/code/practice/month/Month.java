package practice.month;

public enum Month {
    JAN("January",31),FEB("February",28),MAR("March",31),APR("April",30),MAY("May",
            31),JUN("June",30),JUL("Juli",31),AUG("August",31),SEP("September",
            30),OCT("Oktober",31),NOV("November",30),DEZ("Dezember",31);


    private  String name;
    private  int day;

    Month(String name, int day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }
   /* Задайте emun Month, определите месяца, их наименования и количество в них дней.
    Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
    Пример: AUG + 6 month = FEB
    Проверьте работу метода в приложении.*/

//     Metod dly uveli4eniy kol_va mesjzev

    public Month plusMonth(int quantity){
        // Метод plusMonth принимает количество месяцев (quantity), которое нужно добавить к текущему месяцу.

        // Получаем порядковый номер (индекс) текущего месяца в перечислении Month.
        int index = ordinal();
        // Увеличиваем индекс на значение quantity для определения будущего месяца.
        index = index +  quantity;
        // Получаем массив всех значений (месяцев) из перечисления Month
        Month[] months = values();
        // Возвращаем результат операции индекса по модулю длины массива months, чтобы учесть "зацикливание" при достижении конца перечисления.
        return months[index % months.length];
        // Если индекс становится больше длины массива months, операция index % months.length вернет месяц с индексом, который начинается сначала.
        // Например, если текущий месяц - Декабрь (индекс 11) и quantity равно 3, операция вернет месяц с индексом (11 + 3) % 12 = 2 (Март).
    }
}
