package ait.wardrobe.model;

public class Wardrobe implements Comparable<Wardrobe> {
    double height;
    double width;
    double depth;

    public Wardrobe(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
    public  double area(){
        return width * depth;

    }
    public  double volume(){
        return  area() * height;

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Wardrobe wardrobe = (Wardrobe) object;

        if (Double.compare(height, wardrobe.height) != 0) return false;
        if (Double.compare(width, wardrobe.width) != 0) return false;
        return Double.compare(depth, wardrobe.depth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }

    @Override
    public int compareTo(Wardrobe o) {
        // Метод compareTo используется для сравнения высоты текущего объекта с другим объектом типа Wardrobe (переданным в качестве параметра).
        // Сравниваем высоту текущего объекта (this) с высотой переданного объекта (o).
        // Используется метод Double.compare() для сравнения двух значений типа double.
        // Возвращается результат сравнения высоты текущего объекта (this.height) с высотой объекта (o.height).
        return Double.compare(height,o.height);
        // Результатом будет:
        //   - положительное число, если высота текущего объекта больше высоты объекта (o),
        //   - отрицательное число, если высота текущего объекта меньше высоты объекта (o),
        //   - или 0, если высоты равны.
    }

}
