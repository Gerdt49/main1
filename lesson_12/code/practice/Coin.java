package practice;
       //Подбросьте монетку 100 раз.
       // Сколько раз выпала решка? Сколько орел?
       // Сравните итоговые вероятности выпадения орла и решки.
public class Coin {
           public static void main(String[] args) {
               int[] coin = new int[100];
               int a = 0;
               int b = 1;

               for (int i = 0; i < coin.length; i++) {
                coin[i]   =  (int) (Math.random() * (b - a + 1) + a);

               }
               printArray(coin); // podali massiv

              int avers =0;
              int revers = 0; // sbrosili na 0
               for (int i = 0; i < coin.length; i++) {
                   if(coin[i] == 0){
                       avers++;
                   }else  {
                       revers++;

                   }
               }
               System.out.println( "Avers = " + avers + " " + (double)avers/100);
               System.out.println( "Revers = " + revers +" " + (double)revers/100);
           }
// :::::::::::::::::::::::::::::::.
           public static void printArray(int[] arr){
               for (int i = 0; i < arr.length; i++) {
                   System.out.print(arr[i] + " ");
               }
               System.out.println();
           }






           // zapustim zikl na 100 ras ,ot dat4ika slu4ajnix 4isel 0 ili 1
           // zapischem res broskov v massiv

          
           

       
}
