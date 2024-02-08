package main;

public class IncreasingDecreasingStar {

	public static void main(String[] args) {
		
		int n=5;
		
		//INCREASING STAR
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= i; j++){
				print("* ");
				
			}
			
			println("");
			
		}
		println("");
		println("");
		
		
		//DECREASING STAR
		for(int i = n; i >= 1; i--){
			for (int j = i; j>= 1; j--){
				print("* ");
			}
			println(" ");
		}
		
	}
	
	static void println(String e){
		System.out.println(e);
	}
	
	static void print(String e){
		System.out.print(e);
	}
}
