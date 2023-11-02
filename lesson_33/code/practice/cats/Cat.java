package practice.cats;

public class Cat implements Comparable<Cat>{

    private int id;
    private  String name;
    private  String  breed;
    private int age;
    private double weight;

    public Cat(int id, String name, String breed, int age, double weight) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Cat cat = (Cat) object;

        return id == cat.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

     // etot metod pozvalyet sravnenie obektov etogo klassa
    // on sravnivaet tekuschij ( this) s Cat o
    // i vozvraschaet zeloe 4islo.Esli ono > to obekti menjutsj mestami, b ostaln slu4 kak est
    @Override
    public int compareTo(Cat o) {
        // 'this' относится к текущему объекту Cat, вызывающему данный метод.
        // 'o' - это другой объект Cat, переданный в качестве параметра для сравнения возраста с текущим объектом.
        // Рассчитываем разницу между возрастами текущего объекта ('this') и переданного объекта Cat ('o').
        // Используется атрибут 'age' обоих объектов для определения сравнения.
        int res = this.age-o.age; // Вычитаем возраст объекта 'o' из возраста текущего объекта 'this'.
        // 'res' будет содержать положительное значение, если возраст текущего объекта больше,
        // отрицательное значение, если возраст текущего объекта меньше,
        // или ноль, если возраста равны.

        // Возвращаем результат сравнения.

        return res;// Этот результат сравнения будет использоваться для сортировки или упорядочивания объектов Cat.
    }

}
