package tutorial32;

class Color {
    public void showColor() {
        System.out.println("My color is White");
    }
}

interface Favourite {
    public void showinfo();
}

public class AnonymousClass_Tutorial32 {

    public static void main(String[] args) {

        //Color color1 = new Color();  ---> usual creating a new object.
        //but here used the override methods with object declaration which is called anonymous class

        Color color1 = new Color() {
            @Override  //override shoeColor() of Color class
            //here the type of variable is Color but this thing is(this override method) actually a child class of Color
            //Actually the type of this object is some child class of Color,that doesn't actually have a name
            //that's why it's called anonymous class
            //So for anonymous classes there is no way you can create a new object,but it's good a s a one shot thing

            public void showColor() {
                System.out.println("My color is Purple");
            }
        };
        color1.showColor();

        //you can't instantiate an interface cuz there is no code there to actually put into an object
        Favourite favColor = new Favourite() {
            @Override
            public void showinfo() {
                System.out.println("My Favorite color color changed to Blue");
            }
        };
        favColor.showinfo();

    }
}