package main;
import java.util.Scanner;

public class VowelsConsonantsCounter {

	public static void main(String[] args) {
		//Count Vowels and Consonants
		Scanner sc = new Scanner(System.in);
		
		String input = " ";
		System.out.print("Enter a string : ");
		input = sc.next();
		
		int wordL= input.length();
		
		String str = input.toLowerCase();
		
		int vowels = 0;
		int consonants= 0;
		for(int i = 0; i <= wordL-1;i++){
			
			if(str.charAt(i) == ('a')||str.charAt(i) ==('e')||str.charAt(i) == ('i') || str.charAt(i) == ('o') || str.charAt(i) == ('u')){
				vowels++;			
			}else if (str.charAt(i) >= 'a' || str.charAt(i)<= 'z'){
			consonants++;	
			}
		}
			
			System.out.println("Vowels    : " + vowels);
			System.out.println("Consonants: " + consonants);
		
		
	}
}
