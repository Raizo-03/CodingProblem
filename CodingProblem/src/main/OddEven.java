package main;
import java.util.*;

public class OddEven {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int arraySize = 0;
		print("Enter size of the array: ");
		arraySize = sc.nextInt();
		
		
		int[] mainArray = new int[arraySize];
		
		
		for(int i = 0; i < arraySize; i++){
			print("Enter number " + (i + 1)  + " : ");
			mainArray[i] = sc.nextInt();		
		}
		
		int[] oddNums = new int [arraySize];
		int[] evenNums = new int[arraySize];
		for (int j = 0; j < arraySize; j++) {
			
			if (mainArray[j] % 2 == 0){
				evenNums[j] = mainArray[j];
			}
			
			if (mainArray[j] % 2 == 1){
				oddNums[j] = mainArray[j];
			}
		}
		
		println(" ");
		println("Even numbers: ");
		for (int e = 0; e < arraySize; e++){
			print(evenNums[e] + " ");
		}
		println("");
		println("Odd numbers: ");
		for(int o = 0; o < arraySize; o++){
			 print(oddNums[o] + " ");
		}
		
		
		
	}
	
	
	static void println(String e){
		System.out.println(e);
	}
	
	static void print(String e){
		System.out.print(e);
	}

}
