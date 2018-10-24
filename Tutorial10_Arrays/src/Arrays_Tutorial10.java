
public class Arrays_Tutorial10 {

	public static void main (String[] args){
		
		int value =7; //this is a value type.a value variable and allocate memory for the value
		
		int[] values ; //this is a reference type.referencing memory
		values =new int[3];
		
		System.out.println(values[0]);
		
		//setting values
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		// getting values
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		//iterate through the array
		for (int i =0; i<values.length; i++){
			System.out.println(values[i]);
		}
		
		//Initialize an array at the same time declaring it 
		int[] numbers ={5,6,7,8,9};
		
		for (int i=0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}
	
}
