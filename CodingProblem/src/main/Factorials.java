package main;
import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		//Factorial
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		print("Enter number : ");
		input = sc.nextInt();
		
		
		factorial(input);
		
	}
	
	static void factorial(int e){
		int factorial = 1;
		
		for(int i = e; i > 1; i-- ){
			factorial = factorial* i;			
		}	
		printI(factorial);
		
	}
	
	static void println(String e){
		System.out.println(e);
	}
	static void print(String e){
		System.out.print(e);
	}
		static void printI(int e){
		System.out.print(e);
	}

}
