package main;
import java.util.Scanner;
public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = 0;
		int currentTerm = 0, nextTerm = 1;

		
		number = s.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.print(currentTerm + " ");
			int sum = currentTerm + nextTerm;
			currentTerm = nextTerm;
			nextTerm = sum;
			
		}
		
		
		
		s.close();
		
	}

}
