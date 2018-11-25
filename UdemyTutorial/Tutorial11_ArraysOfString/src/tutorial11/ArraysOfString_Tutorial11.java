package tutorial11;

public class ArraysOfString_Tutorial11 {

	public static void main(String[] args){
		String[] texts =new String[3];
		texts[0] = "Hello ";
		texts[1] = "to ";
		texts[2] ="you";
		
		System.out.println(texts[0] + texts[1] + texts[2]);
		
		String[] fruits ={"Apple","Banana","Kiwi","Orange"};
		
		//iterating array using for loop without index(last one used for loop indexing)
		for(String fruit : fruits){
			
			System.out.println(fruit);
		}
		for (String greeting : texts ){
			System.out.println(greeting);

		}
		
		int value = 0;
		System.out.println(value);
		
		String word =null;
		System.out.println(word);

		int[] values =new int[2];
		System.out.println(values[0]);
		
		String[] words =new String[3];
		System.out.println(words[0]);


	}
}
