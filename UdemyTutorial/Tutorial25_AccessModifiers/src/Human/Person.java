package Human;

public class Person {

    public String name; // bad practice --> public final static String name is a good practice
    protected int id;
    String type;
    private  double height ;

    public Person(){
        name = "Feddy";
        id = 1;
        type = "low";
        height = 89.3;
    }
}
