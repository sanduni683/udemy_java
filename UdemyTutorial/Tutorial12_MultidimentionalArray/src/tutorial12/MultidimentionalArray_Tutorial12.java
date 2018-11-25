package tutorial12;

public class MultidimentionalArray_Tutorial12 {

	public static void main(String[] args) {
	
		//  first way of initialize an array
		int[][] grid= {
				{1,2,3},
				{3,5,7,8,9},
				{2,3},
				{9,3,5,6,7,8}
		};
		System.out.println(grid[0][1]);
		
		for (int i =0; i<grid.length; i++){
			for (int k=0; k < grid[i].length; k++){
				System.out.print(grid[i][k] + "\t");
			}
			System.out.println();
		}
		
		
		// second way of initialize an array
		String[][] test = new String[2][2];
		
		test[0][0] ="a";
		test[0][1] ="b";
		test[1][0] ="c";
		test[1][1] ="d";
		
		//for i and k variables initial value =1 and not 0
		System.out.println(test[0][1]);
	    for(int i=1; i<test.length+1; i++){
	    	for(int k=1; k<test[i-1].length+1; k++){
				System.out.print(test[i-1][k-1] + "\t");
	    	}
			System.out.println();
		}
		
	    
		// third way of initialize an array
		String[][] texts;
		texts = new String[4][4];
		
		texts[0][0] ="my";
		texts[0][1] ="wow";
		texts[2][0] ="what";
		texts[3][3] ="ohh";
		texts[3][1] ="common";
		
		System.out.println(texts[0][0]);
		System.out.println(texts[0][2]);
		
		for (int i=0; i<texts.length; i++){
			for(int k=0; k < texts[i].length; k++){
				System.out.print(texts[i][k] + "\t");
			}
			System.out.println();
		}
		
		//shorthand printing array using for loop
		for(String[] gird : texts){
			for(String t  : gird){
			System.out.print(t + "\t");
			}
			System.out.println();
		}
		

	}

}
