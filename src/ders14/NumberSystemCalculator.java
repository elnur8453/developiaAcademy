package ders14;

import java.util.Scanner;

public class NumberSystemCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers and their bases
        System.out.println("Enter first number:");
        String num1 = scanner.nextLine();
        System.out.println("Enter base of first number (2 for binary, 8 for octal, 10 for decimal, 16 for hexadecimal):");
        int base1 = scanner.nextInt();

        System.out.println("Enter second number:");
        String num2 = scanner.next();
        System.out.println("Enter base of second number (2 for binary, 8 for octal, 10 for decimal, 16 for hexadecimal):");
        int base2 = scanner.nextInt();

        // Input arithmetic operation
        System.out.println("Enter operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        // Input base for result
        System.out.println("Enter base for result (2 for binary, 8 for octal, 10 for decimal, 16 for hexadecimal):");
        int resultBase = scanner.nextInt();

        // Convert input numbers to decimal
        int decimalNum1 = convertToDecimal(num1, base1);
        int decimalNum2 = convertToDecimal(num2, base2);

        // Perform arithmetic operation
        int result = performOperation(decimalNum1, decimalNum2, operation);

        // Convert result to chosen base
        String resultInBase = convertFromDecimal(result, resultBase);

        // Display the result
        System.out.println("Result: "+resultInBase);
    }
    public static int convertToDecimal(String number, int base) {
        return Integer.parseInt(number, base);
    }
    public static int performOperation(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
    public static String convertFromDecimal(int number, int base) {
        return Integer.toString(number, base);
    }
}


