package practice.json_wrapper;

// name : Leonid, alt : 59 - eto danie v odnoj programe
// {name: Leonid, age: 59}  - eto Json , kotorij peredaet drugoy programme i ona mozet pro4itat
public class JsonWrapper {

    // pole klassa
    private Object value; // value -zna4enie

    // konstruktor


    public JsonWrapper(Object value) {
        this.value = value;

    }
    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value:" + value + "}";

    }
}
