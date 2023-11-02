package practice.HW_19.Product;

public class ProductAppl {
    public static void main(String[] args) {

        Product[] products = new Product[4];


        products[0] = new Product("Food",15679876, 3.50);
        //System.out.println(products[0]);

        products[1] = new Food("Noodles",123456789,3.90, "5.10.2023");
        //System.out.println(products[1]);


        products[2] = new MeatFood("Servelat",998766433, 12.25, "12.11.2023","Rind");
        //System.out.println(products[2]);

        products[3] = new MilkFood("Cheese",1324236347,16.50,"1.10.2023","Natur", 45);
        System.out.println(products[3]);

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

            double sumPreis = 0;
            for (int i = 0; i < products.length; i++) {
                sumPreis = sumPreis + products[i].getPrice();

            }
            System.out.println( "Summa of Prices :" + sumPreis);

        }

    }

