package animal;

import Human.Person;

public class Cat extends Person {

    public Cat(){
        this.name = " Miyun";
        this.id = 3;
        //this.type = "old";   type is default  -->default can only access within the same package
        //this.height = 189.3; height is private -->private can access only within the same class
    }
}
