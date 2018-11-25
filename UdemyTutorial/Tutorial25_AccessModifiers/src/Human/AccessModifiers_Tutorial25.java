package Human;

import animal.Cat;
import animal.Dog;

public class AccessModifiers_Tutorial25 {
    public static void main(String []args){

        Person person1 = new Person();
        System.out.println(person1.name);
        System.out.println(person1.id);
        System.out.println(person1.type);
        // System.out.println(person1.height);

        Teacher techer1 = new Teacher();
        System.out.println(techer1.name);
        System.out.println(techer1.id);
        System.out.println(techer1.type);
        // System.out.println(techer1.height);

        Cat cat = new Cat();
        System.out.println(cat.name);
        System.out.println(cat.id);
        //System.out.println(cat.type);
        // System.out.println(cat.height);

        Dog dog = new Dog(person1);
        System.out.println(dog.owner.name);
        //System.out.println(dog.id);
        //System.out.println(dog.type);
        // System.out.println(person1.height); //this won't work since height is private[private only within same class]

    }
}
