package practice.beverage.model;

public class Beverage {
    // fields

  private String title; // naimenovanie
  private String packing; // vid upakovki
  private int quantity; // koli4estvo

    // konstruktor

    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }
  // pustoj konstruktor
    public Beverage() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // metod dlj pokupki

    public void  toBuy(String title, String packing, int  quantity){

    //    this.packing = packing;
     //   this.title = title;
    //    this.quantity = quantity;
       System.out.println("Go to market and buy: " + title + " " + packing + " " + quantity+ ".");

    }

    // dly proverki 4to ostalos na sklade

    public void  displayStock(){
        System.out.println("We have : " + title + " " + packing + " " + quantity);


    }
}
