package main;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        int sum = 0;
        String numberString = String.valueOf(number);
        
        int[] num = new int[numberString.length()];
        
        for(int i = 0; i < numberString.length(); i++) {
            num[i] = numberString.charAt(i) - '0';
            
            // Cube the current digit and add it to sum
            sum += num[i] * num[i] * num[i];
        }
        
        if(sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

