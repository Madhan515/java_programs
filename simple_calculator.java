import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = s.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        s.close();
    }
}