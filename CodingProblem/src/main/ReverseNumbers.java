package main;
import java.util.*;

public class ReverseNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Reverse a number
		int [] arr = new int [5];
		for(int i = 0; i <= arr.length-1; i++){
			System.out.print("Enter a number : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Reversed Number");
		for(int j = arr.length-1;j>= 0; j--){
			System.out.print(arr[j] + " ");
		}
		
		
	}
}
