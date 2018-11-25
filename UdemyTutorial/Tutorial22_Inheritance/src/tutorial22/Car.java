package tutorial22;

//tutorial22.Car is derived from tutorial22.tutorial24.Machine / tutorial22.Car is the Child class Of tutorial22.tutorial24.Machine and tutorial22.Car inherits from tutorial22.tutorial24.Machine
public class Car extends Machine {

    //override the start method(same name , return type..)
    public void start(){
        System.out.println("tutorial22.Car started");
    }

    @Override
    public void showInfo() {
        //super.showInfo();
        System.out.println("tutorial22.Car number");
    }
}
