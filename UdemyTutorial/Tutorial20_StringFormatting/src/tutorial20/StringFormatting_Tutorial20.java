package tutorial20;

public class StringFormatting_Tutorial20{

    public static void main (String []args){
//StringBuilder and StringBuffer are the same, StringBuffer class is thread safe version of StringBuilder.
        //inefficient way to append String
        String info = "";
        info += "hello this is Sanduni";
        info +=  ". ";
        info += "I'm a Programer.";
        System.out.println(info);

        //1.efficient way to append text
        StringBuilder sd = new StringBuilder("");

        sd.append("Hello...");
        sd.append("Glad to meet you");
        sd.append(". ");
        System.out.println(sd.toString());

        //1.efficient way to append text
        StringBuilder sd2 = new StringBuilder(16);

        sd2.append(1).append(2).append(3).append(4).append(5);
        System.out.println(sd2.toString());

        //////////// Formatting /////////////////////
        System.out.print("Here is some text.\t That was a tab.\n This is a new line");
        System.out.println("Some more text");

        //Integer formatting
        //%d is formatting character and 120, 5 are values
        System.out.printf("Total cost is %d and quantity is %d \n", 120 , 5);
        System.out.printf("Values are %10d %10d %10d \n", 10 ,20, 30);

        for(int i=0; i<20; i++){
            System.out.printf("%-2d :  here is some text..\n", i);
        }

        //String Formatting
        System.out.printf("I have some text to print , %s \n", "and it's a big HELLO");
        System.out.printf("Lets try Int and String together %d %s \n", 1 , "This is First value");

        for(int i=0; i<20; i++){
            System.out.printf("%s \n", "This is the value");
            System.out.printf(" %-2d  : %2s \n", i,"This is the value");
        }

        //floating point formatting
        System.out.printf("Total value is : %.2f \n" , 3.8345);
        System.out.printf("Total value is : %5.1f \n" , 78.678345);
    }

}
