package tutorial31;

import java.util.ArrayList;

class Machine {

    @Override
    public String toString() {
        return "I'm Machine";
    }


    public void start(){
        System.out.println("Machine started");
    }
}
class Camera extends Machine {

    @Override
    public String toString() {
        return "I'm a Camera";
    }

    public void snap(){
        System.out.println("Photo snapped");
    }
}
class Printer <T> {

    public void printArray(T[] array) {
        for (Object value : array){
            System.out.println(value);
        }
    }
}

public class GenericsandWildCards_Tutorial31 {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");

        showList(list);

        ArrayList<Machine> machine = new ArrayList<Machine>();

        machine.add(new Machine());
        machine.add(new Machine());

        showInfo(machine);

        ArrayList<Camera> camera = new ArrayList<Camera>();

        camera.add(new Camera());
        camera.add(new Camera());

        show(camera);
        show(machine);

        Printer<Integer> intArray = new  Printer<Integer>();
        Printer<String> stringArray = new  Printer<String>();

        Integer[] array1 = {3,4,5};
        String[] array2 = {"A","B","C"};

        intArray.printArray(array1);
        stringArray.printArray(array2);

        moreWildCards(machine);
        //camera has inherited that start() method from Machine and I didn't override it, this is generics
        moreWildCards(camera);

        //using upper bound (using super keyword)
        moreWildCards2(machine);
        moreWildCards2(camera);

    }

    public static void showList(ArrayList<String> list){
        for (String value : list){
            System.out.println(value);
        }
    }

    public static void showInfo(ArrayList<Machine> machine){
        for (Machine value : machine){
            System.out.println(value);
        }
    }

    //Jva Wildcards
    public static void show(ArrayList<?> list){
        //you can only treat the items in list as objects
        //Object is the ultimate parent of all classes in java
        //here Object is the super class of both Machine and Camera
        for (Object value : list) {
            System.out.println(value);
        }
    }

    //Java Upper bounded wildcards
    public static void moreWildCards(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
            //snap() method is not working since this method belongs to child class Camera, since here taking only machine type methods this method cannot run
           // value.snap();
            //solution for this is lower bound
        }
    }

    //Java Lower bounded wildcards
    public static void moreWildCards2(ArrayList<? super Camera> list) { //either class Camera or super classes of Camera
        for (Object value : list) {
            System.out.println(value);
            //can't call Camera or Machine methods here
            //value.start();
            // value.snap();
        }
    }
}