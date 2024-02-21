package main;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		
		//Diamond 
		
		for(int i = 0; i < row + 1; i++) {
			for(int j = row - 1; j >= i; j--) {
				System.out.print("  ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
			}
			for(int l = 0; l <= i-1; l++) {
				System.out.print("* ");
			}
		
			System.out.println("");
		}
		
		for(int i = 0; i < row; i++) {
			for(int k = 0; k <= i; k++) {
				System.out.print("  ");
			}
			for(int j = row - 1; j >= i; j--) {
				System.out.print("* ");
			}
			for(int l = row -2 ; l >= i; l--) {
				System.out.print("* ");
			}
			
			
			
			System.out.println();
		}
		
	}

}
