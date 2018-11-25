package tutorial26;

public class Polymorphism_Tutorial26 {
    public static void main (String []args){
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree; //plant2 is pointing at tree

        plant1.grow();
        tree.grow();
        plant2.grow();

        //plant1.shedLeaves();  //this never happens because plant1 is Plant type variable and Plant class does not contain ShedLeaves() method
        tree.shedLeaves();
        //plant2.shedLeaves();   //plant2 is Plant type variable and Plant class does not contain ShedLeaves() method

        /*
        * which method can be called is decided by the type of variable
        * which code runs is decided by the real object
        */

        doGrow(plant2);       // which code runs is decided by the real object

    }

    public static void doGrow(Plant plant){
        plant.grow();       //which method can be called is decided by the type of variable
    }
}
