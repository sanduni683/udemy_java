package tutorial123;

public class Tutorial123 {

	public static void main(String[] args) {
		System.out.println("Hello World...!");
		
		//Primitive data types start with simple letters and total 8 types
		boolean myBoolean = true; 			//default false
		byte myByte = 88; 					//8 bits
		char myChar = 'Y'; 					//16 bits
		short myShort = 87;     			//16 bits
		int myInt =877;						//32 bits
		float myFloat = 4566.678f;   		//32 bits
		long myLong =37839393;				//64 bits
		double myDouble = 456.33333333d;  	//64 bits
		
		System.out.println(myBoolean);
		System.out.println(myByte);
		System.out.println(myChar);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myFloat);
		System.out.println(myLong);
		System.out.println(myDouble);
		
		//Non primitive data types- String
		String text ="Hello" ; 
		String name= "Sanduni";
		
		System.out.println(text +" "+ name);
		System.out.println("My double vale is : " + text + myDouble);
		
	}

}
