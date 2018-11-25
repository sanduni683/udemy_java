package tutorial30;

import java.util.ArrayList;
import java.util.HashMap;

class Animal{

}

public class Generics_Tutorial30 {
    public static void main(String[] args){

        /////////////Before java 5///////////////////////
         ArrayList list = new ArrayList();

         list.add("Banana");
         list.add("Apple");
         list.add("lemon");

         String fruit = (String)list.get(1);
         System.out.println(fruit);

         ////////////////Modern Style//////////////////
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("Cat");
        strings.add("Dog");
        strings.add("Rabbit");

        String animal = strings.get(2);
        System.out.println(animal);

        ///////////////There can be more than one type of argument///////////////////////
        HashMap<Integer , String> map = new HashMap<Integer , String>();

        ///////////////Java 7 style////////////////////////
        ArrayList<Animal> animalList = new ArrayList<>();
    }
}
