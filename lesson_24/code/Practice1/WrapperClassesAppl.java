package Practice1;

public class WrapperClassesAppl {
    public static void main(String[] args) {

        Integer x = 987654321; // obekt Integer
       // x.toString()
        String st = x.toString(); // preobrazovanie v stroku
        //st.length()
        int l = st.length(); // uznali dlinu stroki
        System.out.println("Number of digits in " + x + "=" + l  );

        System.out.println(x.MAX_VALUE);  // max veli4ina  zna4enie dly takogo tipa

        Double y = 32456.78;
        String st1 = y.toString();
        System.out.println("Number of digits in " + y + " = " + st1.length() );

        // prisvienie i vi4eslenie

        int n = 20;
        Integer m = 10;
        System.out.println("n= " + n);
        System.out.println("m= " + m);
        m= m + n ; // avtoraspokovka i avtoupakovka
        System.out.println("m +n =" + m);
        Double pi = 3.14;
        double circleLenght = 2 * pi * 10;
        System.out.println("Circle Lenght = " + circleLenght );
        System.out.printf("Circle Lenght = %.2f", circleLenght );

       //constant klassov i obertok
        System.out.println("___________Constans of Wrapper Classes");
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " + Long.MAX_VALUE);
        System.out.println("Long MIN " + Long.MIN_VALUE);
        System.out.println("Double MIN " + Double.MIN_VALUE);
        System.out.println("Double MAX " + Double.MAX_VALUE);

        // Obrabotka deleniy na 0

        System.out.println("_________________Not_aNumber (NaN)____________");
        double a = 20.0 / 0;
        if (Double.isInfinite(a)|| Double.isNaN(a) ){ // beskone4nost ili nesuschestvuje 4islo
            System.out.println("Wrong operation or wrong result. ");
        } else{
            System.out.println(a);
        }

        // perevod String to number

        System.out.println("Parsing String to number");
        String str = "09876543";
        int num = Integer.parseInt(str); // otd stroku
        System.out.println(" String " + str + " = " + num );


        String str1 = "2.7118281828";
        double exp = Double.parseDouble(str1);
        System.out.println("Exp =" + exp );
        }



    }
