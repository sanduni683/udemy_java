package tutorial24;

import tutorial24.Info;

public class Interfaces_Tutorial24 {
    public static void main(String []args){
        Person person1 = new Person("Shalu");
        person1.speak();
        person1.showinfo();

        Machine machine1 = new Machine();
        machine1.start();
        machine1.showinfo();
        Info info1 = new Machine();

        //tutorial24.Info interface can't use new keyword , but can point any other objects
        //info1 can only access interface methods
        info1.showinfo();

        Info info2 = person1;
        info2.showinfo();
        //info2 can access interface methods and tutorial24.Person class methods both.
        ((Person) info2).speak();

        System.out.println();

        outputInfo(machine1);
        outputInfo(person1);

    }
    //HERE METHOD IS STATIC BECAUSE MAIN METHOD IS STATIC,SINCE APP CLASS DOES NOT CREATE ANY OBJECTS HERESTATIC MAIN METHOD CALLING STATIC METHOD SINCE THESE METHODS ARE OWN BY CLASS
    private static void outputInfo(Info info){
        info.showinfo();
    }
}
