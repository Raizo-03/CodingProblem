package main;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		
		for(int i = 0; i < row ; i++) {
			
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for(int i = 0; i <= row; i++) {
			for(int j = row-1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();

		}
		
		System.out.println();

		for(int i = 0; i < row; i++) {
			for(int j = row -1; j >= i; j--) {
				System.out.print("  ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			
			for(int l = 0; l <= i-1; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	
}
