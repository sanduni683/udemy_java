package Human;

public class Teacher extends Person {
    /* like this we cannot assign values , java needs either Constructor(new keyword) or method to access different classes variables
    INSIDE A CLASS THERE CAN BE INITIALIZING VARIABLES , CONSTRUCTORS AND METHODS BUT CANNOT ASSIGN VALUES AFTER INITIALIZING
    name = " Sanduni";
    id = 2;
    */

    public Teacher(){
        this.name = " Sanduni";
        this.id = 2;
        this.type = "old";
       // this.height = 189.3; height is private -->private can access only within the same class
    }
}
