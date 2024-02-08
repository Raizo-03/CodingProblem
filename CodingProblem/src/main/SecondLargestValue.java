package main;
import java.util.*;

public class SecondLargestValue {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                secondMax = max;
                max = arr[j];
            } else if (arr[j] > secondMax && arr[j] != max) {
                secondMax = arr[j];
            }
        }

        System.out.println("Second Max: " + secondMax);
    }
}
