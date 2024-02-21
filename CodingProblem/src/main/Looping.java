package main;
import java.util.*;
import java.io.*;


public class Looping {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        
        //t = number of lines 
        //a = starting number
        //b = adding number
        //n = number of values 
        
        //Formula: a + ( i * b) 
        //Constraints: 0 <= t <= 500 || 0 <= a, b <= 50 || 1 <= n <= 15
        
        if (t >= 0 && t <= 500) {       
        for(int i=0;i<t;i++){
        	
            int a = in.nextInt();
        	int b = in.nextInt();     	
            int n = in.nextInt();                
            
            if(a >= 0 && a <= 50 && b <= 50 && b <= 50 && n >= 0 && n <= 15  ) {      
               for(int j = a; j<= n; j++ ) {
            	int sum = a + (j * b);
            	System.out.print(sum + " ");
               }
            }else System.out.print("Constraints: 0 <= t <= 500 || 0 <= a, b <= 50 || 1 <= n <= 15");;         
      
        }
        }else {
        	System.out.print("number of lines should be from 0 to 500");
        }
        in.close();
		
		
	}

}
