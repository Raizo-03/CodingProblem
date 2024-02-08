package main;
import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		//Palindrome Checker
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String input = sc.next();
		
	
		String result= IsPalindrome(input);
		System.out.println(result);
	
		}
		
	
	static String IsPalindrome(String e){
		
		String reversed = "";
		int wordL = e.length();
		
		for(int i = wordL-1; i >= 0; --i){
			
			reversed = reversed + e.charAt(i);	
		}
			
			if(!e.toLowerCase().equals(reversed.toLowerCase()))
			{
			return e + " is not a palindrome";
			
			}
						
			return e + " is a palindrome";
	}
}
