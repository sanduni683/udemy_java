package tutorial18;

class Machine {
    private String name ;
    private int code;

    //constructor is a special method which runs every time you create an instance of your class
    //constructor doesn't have a return type, which method should have.
    //constructor name shold be the same as class name and can include different parameters

    public Machine(){
        //invoke second constructor
        this("Tony");
        System.out.println("First constructor is calling");
        //constructor used for initialization of instance variables
        name= "Arnie";

    }
    public Machine(String name){
        //invoke third constructor
        //this("Tony", 1);

        this.name =name;
        System.out.println("Second constructor is calling");
        System.out.println(name);
    }
    public Machine(String name, int code){
        //invoke first constructor
        this();

        this.name =name;
        this.code =code;
        System.out.println("Third constructor is calling");
        System.out.println(name + code);
    }
}

public class Constructors_Tutorial18{
    public static void main(String []args){
        Machine machine1 = new Machine();

        new Machine();

        //tutorial18.tutorial22.tutorial24.Machine machine2 = new tutorial18.tutorial22.tutorial24.Machine("Sam");

        Machine machine3 = new Machine("Nilu" , 5);

    }
}
