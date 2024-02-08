package main;
import java.util.*;

public class InsertingArrayIntoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]numbers = new int [3];
		int[] num = new int[3];
		
		for(int h = 0; h < 3; h++){
			print("Enter number " + (h+1) + ":");
			numbers[h] = sc.nextInt();
		}
		
		for(int i = 0; i < 3;i++){
			num[i] = numbers[i];
		}
		
		
		println("Numbers Array");
		for (int j = 0; j < 3; j++){
			print(numbers[j] + " ");
		}
		println("");
		println("Num Array");
		
		
		for (int k = 0; k < 3; k++){
			print(num[k] + " ");
		}
	}
	
	static void println(String e){
		System.out.println(e);
	}
	
	static void print(String e){
		System.out.print(e);
	}
	
}
