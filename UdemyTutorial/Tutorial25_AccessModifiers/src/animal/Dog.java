package animal;

import Human.Person;

public class Dog{

    public Person owner;

    public Dog(Person owner){
        this.owner = owner;
        owner.name = "John";
        //owner.id = 4;         id is protected  -->protected can access within same class ,subclass or same package
        //owner.type = "old";   type is default  -->default can only access within the same package
        //owner.heighot = 189.3; height is private -->private can access only within the same class
    }
}
