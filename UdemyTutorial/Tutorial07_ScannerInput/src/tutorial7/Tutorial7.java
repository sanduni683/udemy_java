package tutorial7;

import java.util.Scanner;

public class Tutorial7 {

	public static void main(String[] args) {
		// Create input object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//Prompt input line on the cmd
		System.out.println("Enter your name : ");
		
		//wait for the user to enter a text
		String line = input.nextLine();
		
		//Show user what they have entered
		System.out.println("Hello " + line);
		
		Scanner intInput =new Scanner(System.in);
		System.out.println("Enter your age : ");
		int value = intInput.nextInt();
		System.out.println("Your age is : " + value);
		
		Scanner floatInput =new Scanner(System.in);
		System.out.println("Enter your value :");
		float floatValue =floatInput.nextFloat();
		System.out.println("Youur float value is : " + floatValue);
				
	}

}
