// This program performs basic arithmetic operations: addition, subtraction, multiplication, and division.

import java.util.Scanner;

public class CSC7014Assignment1 {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to Basic Calulator by Dipesh\n \n");

        // Taking input for two numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("\n Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = add(number1, number2);
        double difference = subtract(number1, number2);
        double product = multiply(number1, number2);
        double quotient = divide(number1, number2);

        // Display the results
        System.out.println("\n The Addtion of " + number1 + " and " + number2 + " is " + sum);
        System.out.println("\n The Subtraction of " + number1 + " and " + number2 + " is " + difference);
        System.out.println("\n The Multiplication of " + number1 + " and " + number2 + " is " + product);
        if (number2 != 0) {
            System.out.println("\n The Division of " + number1 + " and " + number2 + " is " + quotient);
        } else {
            System.out.println("\n Error: Division by zero is not allowed. \n choose another number");
        }

        // Close the scanner
        scanner.close();
    }

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            return 0; // Return 0 when dividing by zero
        }
        return a / b;
    }
}
