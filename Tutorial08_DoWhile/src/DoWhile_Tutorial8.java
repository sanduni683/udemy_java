import java.util.Scanner;

public class DoWhile_Tutorial8 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int value =0;
		
		/*
		while(value  != 5){
			System.out.println("Enter a number : ");
			value =scanner.nextInt();
		}
		System.out.println("Value is equal to 5");
		*/
		do{
			System.out.println("Enter a number : ");
			value =scanner.nextInt();
		}while(value  != 5);
		
		System.out.println("Value is equal to 5");

	}

}
