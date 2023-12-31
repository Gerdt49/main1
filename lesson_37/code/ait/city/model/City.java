package ait.city.model;

public class City implements Comparable<City> {
    private String name;
    private  int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        City city = (City) object;

        if (population != city.population) return false;
        return name.equals(city.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + population;
        return result;
    }

    @Override
    public int compareTo(City o) {
        // Метод compareTo используется для сравнения населения текущего объекта с населением другого объекта типа City (переданного в качестве параметра).
        // Сравниваем население текущего объекта (this) с населением переданного объекта (o).
        // Используется метод Integer.compare() для сравнения двух значений типа int.
        // Возвращается результат сравнения населения текущего объекта (this.population) с населением объекта (o.population).
        return Integer.compare(population,o.population);
        // Результатом будет:
        //   - положительное число, если население текущего объекта больше населения объекта (o),
        //   - отрицательное число, если население текущего объекта меньше населения объекта (o),
        //   - или 0, если населения равны.
    }

}
