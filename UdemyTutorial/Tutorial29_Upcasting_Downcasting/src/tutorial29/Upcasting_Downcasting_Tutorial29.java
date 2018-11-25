package tutorial29;

class Machine {
    public void start(){
        System.out.println("upcastingdowncasting.tutorial22.tutorial24.Machine started");
    }
}
class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("upcastingdowncasting.Camera started");
    }

    public void snap(){
        System.out.println("Photo taken");
    }
}

public class Upcasting_Downcasting_Tutorial29 {
    public static void main(String[] args){
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        //upcasting
        //upcasting is safe and you dont need explicit cast inside brackets
        Machine machine2 = camera1; //this is equal to--------------->  upcastingdowncasting.tutorial22.tutorial24.Machine machine2 = new upcastingdowncasting.Camera();  --------->POLYMORPHISM
        machine2.start();
        // error : machine2.snap(); THEREFORE UPCASTING-------
        ((Camera) machine2).snap(); //1. I DON'T KNOW THIS IS THE SAME AS NUMBER 2

        //Downcasting
        //DOWNCASTING IS INHERENTLY UNSAFE THEREFORE THEY NEED CONFIRMATION FROM US, NOT AUTO CORRECTING , WE NEED TO PUT IT.UNLIKE NUMBER 1
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3; //2 .I DON'T KNOW THIS IS THE SAME AS NUMBER 1
        camera2.start();
        camera2.snap();

        //Doesn't work runtime error
        //upcastingdowncasting.tutorial22.tutorial24.Machine machine4 = new upcastingdowncasting.tutorial22.tutorial24.Machine();
        //upcastingdowncasting.Camera camera3 = (upcastingdowncasting.Camera) machine4;     // upcastingdowncasting.tutorial22.tutorial24.Machine cannot be cast to upcastingdowncasting.Camera
        //camera3.start();
        //camera3.snap();
    }
}
