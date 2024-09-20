import java.util.Scanner;

public class FunctionalCalculator {

    // Method to perform the calculation based on the operation
    public static double calculate(double num1, double num2, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operation.");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            // Input
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Choose an operation (+, -, *, /, %): ");
            char operation = scanner.next().charAt(0);

            // Calculate result
            double result = calculate(num1, num2, operation);

            // Output the result
            System.out.println("The result is: " + result);

            // Ask if the user wants to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userResponse = scanner.next().toLowerCase();

            // Continue or terminate based on user input
            if (!userResponse.equals("yes")) {
                continueCalculation = false;
                System.out.println("Calculator terminated.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
