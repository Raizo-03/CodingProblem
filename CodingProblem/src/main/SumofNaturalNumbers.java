package main;
import java.util.*;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		//Sum of Natural Numbers
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= input; i++){
			sum += i;			
		}
		
		System.out.println("Sum: " + sum);
		
		
		
	}
}
