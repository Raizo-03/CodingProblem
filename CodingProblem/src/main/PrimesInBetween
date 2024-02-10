import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int num1 = s.nextInt();
            int num2 = s.nextInt();

            printPrimes(num1, num2);
        } catch (Exception e) {
            System.out.println("Input is not an integer");
        }
    }

    static void printPrimes(int number1, int number2) {
        // Ensure number1 is less than number2
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        for (int i = Math.max(number1, 2); i <= number2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}