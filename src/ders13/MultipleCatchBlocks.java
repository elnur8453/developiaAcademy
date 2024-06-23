package ders13;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the second number:");
            int b = Integer.parseInt(scanner.nextLine());

            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}
