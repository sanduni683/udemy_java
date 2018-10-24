
public class IfElse_Tutorial6 {

	public static void main(String[] args) {
		int myInt =10;

		if (myInt < 10){
			System.out.println("The value is less than 10");
		}
		else if (myInt > 10){
			System.out.println("The value is greater than 10");
		}
		else{
			System.out.println("The value is equal to 10");
		}
		
		int loop =0;
		
		while (true){
			System.out.println("looping " + loop);
			
			if (loop == 5){
				break;
			}
			
			loop++;
			System.out.println("Runing");
		}
		
	}

}
