package Calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second value: ");
        double num2 = scanner.nextDouble();

        // Perform operations
        double sumResult = sum(num1, num2);
        double subtractResult = subtract(num1, num2);
        double multiplyResult = multiply(num1, num2);
        double divideResult = divide(num1, num2);

        // Display results
        System.out.println("Sum: " + sumResult);
        System.out.println("Subtract: " + subtractResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Divide: " + divideResult);

        scanner.close();
    }

    // Method to calculate the sum
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    // Method to calculate the difference
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to calculate the product
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to calculate the quotient
    public static double divide(double num1, double num2) {
        // Check for division by zero
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
    }
}
	
	


