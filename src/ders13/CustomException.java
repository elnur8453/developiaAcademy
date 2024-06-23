package ders13;

class OutOfRangeValueException extends Exception {
    public OutOfRangeValueException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            checkRange(105);
        } catch (OutOfRangeValueException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void checkRange(int number) throws OutOfRangeValueException {
        int lowerBound = 0;
        int upperBound = 100;
        if (number < lowerBound || number > upperBound) {
            throw new OutOfRangeValueException("Number " + number + " is out of range [" + lowerBound + ", " + upperBound + "]");
        }
        System.out.println("Number " + number + " is within the range.");
    }
}
