import java.util.Scanner;

public class Switch_tutorial9 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your command : ");
		String text =input.nextLine();
		
		switch (text) {
		
		case "start" : 
			System.out.println("Start Command");
			break;
			
		case "stop" : 
			System.out.println("Stop command");
			break;
			
		default : 
		System.out.println("Command not recognized");
		
		}
	}

}
