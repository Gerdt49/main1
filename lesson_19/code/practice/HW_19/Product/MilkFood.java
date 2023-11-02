package practice.HW_19.Product;

public class MilkFood extends Food {
    private String milkType; // которые хранят тип молока
    private double fat; // которые хранят  жирность продукта соответственно.

    public MilkFood(String name, long barCode, double price, String expDate, String milkType, double fat) {
        super(name, barCode, price, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString() + "MilkFood{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                '}';
    }
}
