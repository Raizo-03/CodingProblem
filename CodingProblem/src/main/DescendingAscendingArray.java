package main;
import java.util.*;
public class DescendingAscendingArray {

	public static void main(String[] args) {
	Scanner sc =  new Scanner (System.in);
		
		int [] numbers = new int [5];
		int input = 0;
		
		for (int i = 0; i < 5; i++){
			print("Enter number " + (i + 1) + ":");
			numbers[i] = sc.nextInt();
		}
		
		println("");
		println("The inputted numbers in ascending are: ");
		for ( int j = 0; j  < 5; j++){
			print(numbers[j] + " ");	
		}
		println("");
		println("The inputted numbers in descending order are: ");
		
		for (int k= 5-1; k >= 0; k--)
		{
			print(numbers[k] + " ");
		}
			
		
	}
	
	static void println(String e){
		System.out.println(e);
	}
	
	static void print(String e){
		System.out.print(e);
	}

}
