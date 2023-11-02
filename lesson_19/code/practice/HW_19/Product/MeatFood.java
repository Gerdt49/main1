package practice.HW_19.Product;

public class MeatFood extends Food{

    private String meatType; // которое хранит тип мяса из которого изготовлен продукт.

    public MeatFood(String name, long barCode, double price, String expDate, String meatType) {
        super(name, barCode, price, expDate);
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return super.toString() + "MeatFood{" +
                "meatType='" + meatType + '\'' +
                '}';
    }
}
