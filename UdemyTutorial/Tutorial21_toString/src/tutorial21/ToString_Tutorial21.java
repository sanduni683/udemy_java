package tutorial21;

public class ToString_Tutorial21 {
    public static void main (String []args){
        //all objects in java have the OBJECT class as their ultimate parent
        //child objects inherits parent Object class methods(String class also the same as Object class)
        //String is a class ,(non primitive data type)
        //but only for string we can create a String variable simply assigning some values , not needed to declare a String object.

        Frog frog1 = new Frog(5 , "Frogie");
        System.out.println(frog1); //taking value of toString(go inside method and see)
        System.out.println(frog1.speak());

        Frog frog2 = new Frog(3 , "Maggie");
        System.out.println(frog2); //taking value of toString(go inside method and see)


    }
}

class Frog {
    private int id;
    private static int count=0;
    private int age;
    private String name;

    public Frog(int age, String name){
        id=count;
        this.age = age;
        this.name= name;
        count++;
    }

    /*
    //overridden toString method
    public String toString() {
        return "Hello";
    }
    */

    //overridden toString method
    public String toString() {
        //1.inefficient way sice concatenating Strings
        //return id + " : " + name + " and " + age;

        //2. using StringBuilder formatting is a efficient way to concatenate strings and integers
        //StringBuilder sb = new StringBuilder();
        //sb.append(id).append(" : ").append(name).append(" ").append(age);
        //return sb.toString();

        //3.using String formatting
        return String.format("%d %s %d", id, name , age);
    }

    public String speak() {
        return "Hello...i'm speaking";
    }
}
