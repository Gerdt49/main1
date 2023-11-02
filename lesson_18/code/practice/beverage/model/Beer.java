package practice.beverage.model;

public class Beer extends Beverage {
     // pole klass
    private String type; // vid, sort piva



    // konstuktor
    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;

    }

    public Beer() {  // pustoj konstruktor
    }

    public  void  toBuy(String title, String packing, int quantity, String type){
        super.toBuy(title, packing, quantity);
        this.type = type; //


    }
    public void displayStock(){
        super.displayStock();
        System.out.println("This is " + type + " of beer.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
