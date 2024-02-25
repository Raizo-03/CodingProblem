package main;

public class InfinityPattern {

	public static void main(String[] args) {
		
		
		//Infinty
		
		int row = 5;
		
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			for(int k = row-1; k >= i; k--) {
				System.out.print("  ");
			}
			for(int k = row -1; k >= i; k--) {
				System.out.print("  ");
			}
			for(int l = 0; l <= i; l++) {
				System.out.print("* ");
			}
			System.out.println();
			
			
		}
		for(int i = 0; i < row; i++) {
			for(int k = row-1; k >= i; k--) {
				System.out.print("* ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("  ");
			}
			for(int k = row-1; k >= i; k--) {
				System.out.print("* ");
			}
			
			
			System.out.println();
			
			
		}
	}

}
