package main;
import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		//Max of arrays
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		int max = arr[0];
		for(int i = 0; i <= arr.length-1; i++){
			System.out.print("Enter number : ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i <= arr.length-1;i++){
			max = Math.max(max, arr[i]);
		}
		System.out.print("Maximum Value: " + max);
		
	}
}
