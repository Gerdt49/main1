package practice.coffee;

public enum Coffee {
    ESSPRESSO("Espresso",3.25), AMERICANO("Americano",3.85) ,CAPUCCINO("Capuccino",
            4.5),LATTE("Latte",4.85);

    private String type;
    private  double price;

    Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
