package Practice1;

public class ArgsApplExamle {
    public static void main(String[] args) {

        // String[] args - eto massiv tipa String , zovut ego args
        // v etot massiv peredovat dannie is koman stroki

        String str1 = args[0]; // 1 argument
        int num1 = Integer.parseInt(str1);

        String str2 = args[1]; // 2 argument
        int num2 = Integer.parseInt(str2);

        System.out.println(str1 + " * " + str2 + "=" + num1 * num2);


        }
    }
