package practice.HW_19.Product;

public class Food extends  Product{ // Food - Еда.

    private String expDate; // которое хранит дату истечения срока годности.

    public Food(String name, long barCode, double price, String expDate) {
        super(name, barCode, price);
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return super.toString() + "Food{" +
                "expDate='" + expDate + '\'' +
                '}';
    }
}

