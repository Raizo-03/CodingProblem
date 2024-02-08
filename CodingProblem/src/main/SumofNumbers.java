package main;
import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		//Sum of numbers
		Scanner sc = new Scanner(System.in);
		int counter = 5;
		int input = 0;
		int sum = 0;
		for(int i = 1; i <= 5; i++){
			print("Enter number " + (i) +":");
			input = sc.nextInt();
			sum += input;
		}
		println("Sum: " + sum);
		
		
		
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
