import java.util.Scanner;

public class prime_number_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // Test divisors i from 2 while i * i <= number (equivalent to i <= Math.sqrt(number))
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }

        scanner.close();
    }
}