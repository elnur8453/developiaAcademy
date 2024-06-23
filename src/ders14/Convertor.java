package ders14;

import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String number = scanner.nextLine();

        System.out.print("Enter the base of the number: ");
        int fromBase = scanner.nextInt();

        System.out.print("Enter the base to convert to: ");
        int toBase = scanner.nextInt();

        String convertedNumber = convertBase(number, fromBase, toBase);
        System.out.println("Converted Number: " + convertedNumber);

        scanner.close();
    }

    public static String convertBase(String number, int fromBase, int toBase) {
        int decimalNumber = Integer.parseInt(number, fromBase);
        return Integer.toString(decimalNumber, toBase);
    }
}
