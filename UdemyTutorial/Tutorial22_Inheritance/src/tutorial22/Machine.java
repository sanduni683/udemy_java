package tutorial22;

public class Machine {

    // private String name = "tutorial22.tutorial24.Machine 4567";    //only within tutorial22.tutorial24.Machine class
    //String name = "tutorial22.tutorial24.Machine 4567";             //Anywhere within the package
    protected String name = "tutorial22.tutorial24.Machine 4567";             //Anywhere within the package and for inherited classes.


    public void start(){
        System.out.println("tutorial22.tutorial24.Machine Started");
    }
    public void stop(){
        System.out.println("tutorial22.tutorial24.Machine Stopped");
    }
    public void showInfo(){
        System.out.println("tutorial22.tutorial24.Machine name" + name);
    }

}
