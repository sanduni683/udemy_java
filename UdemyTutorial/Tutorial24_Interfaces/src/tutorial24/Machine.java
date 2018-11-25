package tutorial24;

import tutorial24.Info;

public class Machine implements Info {
    private int id = 4;

    public void start(){
        System.out.println("tutorial22.tutorial24.Machine started");
    }

    @Override
    public void showinfo() {
        System.out.println("tutorial22.tutorial24.Machine id is : " + id);
    }
}
