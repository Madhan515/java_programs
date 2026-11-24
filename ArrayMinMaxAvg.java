import java.util.Scanner;

public class ArrayMinMaxAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        long sum = arr[0]; 

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }
}