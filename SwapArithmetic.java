import java.util.Scanner;

public class SwapArithmetic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = s.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = s.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap:  a = " + a + ", b = " + b);

        s.close();
    }
} 
    
