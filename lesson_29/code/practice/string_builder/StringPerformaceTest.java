package practice.string_builder;

public class StringPerformaceTest {

    private  static final  int N_Iterattion =  100_000; //
    private static final String WORD = "Word";

    public static void main(String[] args) {

        // String - immutable
        String str = ""; // iniziirovali stroku pustuj
        long t1 = System.currentTimeMillis(); // zasekaem vremy
        for (int i = 0; i < N_Iterattion; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis(); // ZA SKOLKO
        System.out.println(t2 - t1); // stolko vremeni proschlo

        // StringBuilder - mutable
        StringBuilder stringBuilder = new StringBuilder("");
        t1 = System.currentTimeMillis(); // zasekaem vremy
        for (int i = 0; i < N_Iterattion; i++) {
            stringBuilder.append(WORD);
        }
        str = stringBuilder.toString();
        t2 = System.currentTimeMillis(); // ZA SKOLKO
        System.out.println(t2 - t1); // stolko vremeni proschlo

    }
}
