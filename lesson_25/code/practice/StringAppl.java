package practice;

import java.util.Arrays;

public class StringAppl {
    public static void main(String[] args) {

        System.out.println("_____________________________-");

        String str = "Hello";
        char[] chars = {32,'w' , 'o', 'r', 'l', 'd'};
        String str1 = new String(chars);
        System.out.println(str1);

        str = str + str1;
        System.out.println(str);

        str = str.concat(str1); // dobavili  slovo world
        System.out.println(str);

        int l = str.length(); // dlina stoki
        System.out.println("Legth of string " + str + ":" + l);

        char c = str.charAt(str.length() - 1); // opredeljem poslednii simvol v stroke
        System.out.println("Last symbol of string:" + c);

        System.out.println("_____________________________-");

        System.out.println("Print by letters"); // pe4at po bukvam
        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i));
            System.out.print(str.charAt(i) + " ");
        }
            System.out.println();

            System.out.println("_____________________________-");

            String str2 = " World";// sravnivaem s str1 = " world "
            System.out.println(str1.equals(str2)); // false
            System.out.println(str1.equalsIgnoreCase(str2)); // true

            String str3 = str1.toUpperCase();
            System.out.println(str3);
        System.out.println(str3.toLowerCase()); //

        System.out.println("_____________________________-");
        System.out.println(str);
        // index  - posiziy simvola v stroke
        int index = str.indexOf('l'); // str = " Hello"
        System.out.println("Index of l =" + index);

        index = str.indexOf("world");  // s kakogo indexa na4inaetsy  podstroka
        System.out.println(index);

        index = str.indexOf("l" , 4);  // ischem l , na4inaj s 4 indexa v stroke
        System.out.println(index);

        index = str.lastIndexOf('l'); // index poslednego naxozdenia l
        System.out.println(index);

        index =  str.indexOf('A'); // ischen index net bukvi
        System.out.println(index);  // polu4aem -1

        System.out.println("_____________________________-");

        System.out.println(str.substring(4)); // pe4atem  podstraku s indexa
        System.out.println(str.substring(1,8)); //  pe4atem  podstraku s indexa do indexa
        System.out.println((str.replace("o" ,"o-o-o"))); // zamena

        System.out.println("_____________________________-");
        String  str4 = "         Bill    ";
        str4 = str4.trim();  // uberaem probeli
        System.out.println(str4);
        System.out.println("_____________________________-");

        String str5 = "I love String in Java! ";
        String[] worlds = str5.split( " "); // rasdeljem stroku na elementi massiva tipa String
        System.out.println("Quntity of words in string: " + worlds.length); // dlina massiva
        System.out.println(Arrays.toString(worlds)); // nape4atali

        System.out.println("_____________________________-");
        String str6 = "Ich .........";
        String[] letters = str6.split(" "); // rasdelitel net , 4tobi polu4it bukvi
        System.out.println("Quntity of letters in string: " + letters.length); // dlina massiva
        System.out.println(Arrays.toString(letters)); // nape4atali







        }

    }

