package tutorial19;

public class Static_Final_Tutorial19 {
    public static void main(String []args){

        System.out.println("Before creating instances count is : " +  Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating instances count is : " +  Thing.count);

        thing1.name = "Brush";
        thing2.name = "Toothpaste";
        thing1.description = "Use for brush teeth";
        thing2.description = "Use for brush";


        System.out.println(thing1.name);
        System.out.println(thing1.description);
        //we can have the same result without using variable name(Using class name), since static variable belongs to the class
        System.out.println(Thing.description);
        //static method is a class method and common for all instances
        thing1.speak();
        //Therefore this is the proper way to call for a static method
        Thing.speak();

        System.out.println(thing2.name);
        System.out.println(thing2.description);
        //we can have the same result without using variable name(Using class name), since static variable belongs to the class
        System.out.println(Thing.description);


        thing1.showname();
        thing2.showname();



        System.out.println(Math.PI);
        System.out.println(Thing.luckyNumber);

    }
}

class Thing{
    public String name;
    public static  String description;

    //1.usable of static variables --> use static variable so its constant and cannot be accessed or changed
    public final static int luckyNumber = 4;

    //2.count the number of objects that we are creating
    public static int count = 0;

    public int id;

    public Thing(){
        id = count; //assigning count value to id
        count++; //increasing count every time when create a new instance
    }

    public void showname(){
        System.out.println(id + " " +name);
        //instance methods can access static data(variable)
        System.out.println(description);
    }

    public static void speak(){
        //only static variable can use here since method is static.
        //System.out.println(name);
        System.out.println(description);
    }
}