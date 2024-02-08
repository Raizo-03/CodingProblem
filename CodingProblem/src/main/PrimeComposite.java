package main;
import java.util.Scanner;

public class PrimeComposite {

	static String isPrime(int number) {
	    if (number <= 1) {
	        return "Composite";
	    }
	    for (int i = 2; i <= Math.sqrt(number); ++i) {
	        if (number % i == 0) {
	            return "Composite";
	        }
	    }
	    return "Is prime";
	}
	    
	    public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);
	        int number = read.nextInt();
	        String output = isPrime(number);
	        System.out.println(output);
	    }    
	    
}
