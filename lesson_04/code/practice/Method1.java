package practice;

public class Method1 {

    public static void main(String[] args) {


        int a, b;
        a = 3;
        b = 4;
        int c = hipotinusa(a , b);
        System.out.println(c);

        int d = 37;
        int mod = modul(d);
        System.out.println(mod);

        int f = 20;
        int kub = cub(f);
        System.out.println(kub);

    }

    public static int cub(int x){
        return  x * x * x;

    }
    public static int  modul(int d){
        return -d;

    }
    public static int hipotinusa(int a, int b){
        return a * a + b * b;

    }

}
