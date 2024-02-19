package main;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Right Triangle
		int row = 5;
		
		//Increasing Star
		for(int i=0; i<row; i++)   
		{   
		for(int j=0; j<=i; j++)   
		{   
		System.out.print("* ");   
		}   
		System.out.println();  
		}
		
		System.out.println();  
		System.out.println();  

		//Decreasing Star
		for(int i = 0; i < row; i++) {
			for(int j = i; j <= row-1; j++) {
				System.out.print("* ");   
			}
			System.out.println();  
		}
		
		
		System.out.println();  
		System.out.println();
		
		//RIGHT INCREASING STAR
		for(int i = 0; i < row; i++) {
			for(int j = i; j <= row-1; j++) {
				System.out.print("  ");   
			}
			
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
				
			System.out.println();  
		}
		
		
		
		
	}
}
