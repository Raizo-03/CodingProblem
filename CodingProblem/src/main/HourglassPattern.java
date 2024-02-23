package main;

public class HourglassPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row  = 5;	
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j <= i; j++) print("  ");
				
			for(int j = row -1; j >= i; j--) print("* ");
			
			for(int k=row -2; k >= i; k--) print("* ");			
			println("");			
		}
		
		
		for(int i = 1; i < row; i++) {
			for(int j = row -1; j >= i; j--)print("  ");
			
			for(int k = 0; k <= i; k++)print("* ");
			
			for(int l = 0; l <= i-1; l++) print("* ");
			println("");
		}
		
		
	}
	
	static void print(String e) {
		System.out.print(e);
	}
	static void println(String e) {
		System.out.println(e);
	}

}
