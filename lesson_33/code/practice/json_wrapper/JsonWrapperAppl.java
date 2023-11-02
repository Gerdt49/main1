package practice.json_wrapper;

public class JsonWrapperAppl {

    public static void main(String[] args) {

        JsonWrapper wrapper1 =  new JsonWrapper(10);
        System.out.println(wrapper1);
        System.out.println();

        int a = (int) wrapper1.getValue();
        System.out.println(a);


    }

}
