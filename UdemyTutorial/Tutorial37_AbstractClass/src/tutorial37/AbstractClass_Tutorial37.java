package tutorial37;

public class AbstractClass_Tutorial37{
    public static void main(String[] args){

        Car car1= new Car();
        car1.setId(11);
        car1.getId();
        car1.run();

        Camera camera1 = new Camera();
        camera1.setId(21);
        camera1.getId();
        camera1.run();

        //There is a hope for having a Camera and a tutorial22.Car, But tutorial22.tutorial24.Machine for what?
        //There is never gonna be any value in having tutorial22.tutorial24.Machine
        //tutorial22.tutorial24.Machine is a base class that implements some common functionality that any tutorial22.tutorial24.Machine has.
        //cannot initiate a tutorial22.tutorial24.Machine object, since that class use for common functionalists and not for instance initialization,
        //tutorial22.tutorial24.Machine machine1 = new tutorial22.tutorial24.Machine(); tutorial22.tutorial24.Machine is abstract; cannot be initalized
    }
}