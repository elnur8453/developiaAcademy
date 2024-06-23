package ders13;

public class ThrowingException {
    public static void main(String[] args) {
        try {
            checkNegativeNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void checkNegativeNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative: " + number);
        }
        System.out.println("Number is positive: " + number);
    }
}
