package tutorial24;

import tutorial24.Info;

public class Person implements Info {
    private String name;

    public Person(String name){
        this.name =name;
    }

    public void speak(){
        System.out.println("Hello there..I'm "  + name);
    }

    @Override
    public void showinfo() {
        System.out.println("tutorial24.Person name is : " + name);
    }
}
