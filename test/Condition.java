
import java.util.Scanner;

public class Condition {
 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter");
	 
	  int x = sc.nextInt(); // get an int from the input stream
	  if (x >= 0 && x <= 100){
		  if (x >= 5 && x <= 20) { // x value was not set as an int, but was an InputStream object
			     System.out.println("Welcome"); // Typo plus missing semicolon
		  }
	  }
	  else{
		     System.out.println("Try again"); 
	  }
	  
	  sc.close();
  }
}

