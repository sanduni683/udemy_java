package tutorial151617;

class Citizen {
    String name;
    int age;

    void speak(){
        System.out.println("Hello I can speak I'm " + name + " and " + age + " years old.");
    }
    int calculateYearsToRetriement(){
        int yearsLeft = 55 - age ;
        return yearsLeft;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    public void setName(String citizenName){
        name = citizenName;
    }
    void setAge(int age){
        this.age = age;
    }
}

class Robot{
    private String text;
    private double height;
    private String direction;

    public void speak(String text){
        System.out.println(text);
    }
    int jump(int height){
        return  height;
    }
    void move(String text , double height  , String direction){
        System.out.println("Hello I'm " + text +" and I can Jump " + height + " to " +  direction + "direction");
    }
    void setText(String text){
        this.text = text;
    }
    void setHeight(double height){
        this.height = height;
    }
    void  setDirection(String dire){
        direction = dire;
    }
    String getText(){
        return text;
    }
    double getHeight(){
        return  height;
    }
    String getDirection(){
        return direction;
    }
}

public class Methods_Tutorial151617 {
    public static void main(String[] args) {
        Citizen citizen1 =new Citizen();
        //hard coding values without using setters, this is not good for security, als when variables are private we cannot use this way
        citizen1.name = "Sanduni";
        citizen1.age = 27;
        citizen1.speak();

        int years = citizen1.calculateYearsToRetriement();
        System.out.println("Years To Retriement : " + years);

        //using getters to get values
        String name = citizen1.getName();
        System.out.println("Name is : " + name);

        System.out.println("Age is : " + citizen1.getAge());

        //using setter methods call
        Citizen citizen2 = new Citizen();
        citizen2.setName("Nilanka");
        citizen2.setAge(29);

        //using getters to retrive setted values
        System.out.println(citizen2.getName());
        System.out.println(citizen2.getAge());

        //tutorial151617.Robot class Hard core setting values, getters
        Robot sam = new Robot();
        sam.speak("Hello I'm Sam");

        String text = "Sanduni";
        int jumpHeight =7;
        String direction = "North";
        sam.move(text, jumpHeight, direction);

        int height= 9;
        sam.jump(height);
        System.out.println("Sam height : " + sam.jump(height));

        //use setters and getters
        Robot vixx = new Robot();
        vixx.setText("Hello I'm Vixx");
        vixx.setHeight(6.5);
        vixx.setDirection("South");

        System.out.println(vixx.getText());
        System.out.println(vixx.getHeight());
        System.out.println(vixx.getDirection());

    }
}
