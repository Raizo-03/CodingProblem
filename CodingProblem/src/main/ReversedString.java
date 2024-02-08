package main;
import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
		//Reversed String	
		
		Scanner sc = new Scanner(System.in);
		print("Enter a word: ");
		String input = sc.next();
		
		String reverse = reverse(input);
		print(reverse);
		}
		
		static String reverse(String e){
			int wordL = e.length();
			String reverse = " ";
			for (int i = wordL - 1; i >= 0; i--){
				reverse += e.charAt(i);
				
			}
			return reverse;
		}	
		
		static void println(String e){
			System.out.print(e);
		}
				static void printI(int e){
			System.out.print(e);
		}
			static void print(String e){
			System.out.print(e);
		}
}
