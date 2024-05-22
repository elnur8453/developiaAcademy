package ders9;

import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        //Task1:
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        String strFromArray = new String(charArray);

        System.out.println("String from character array: " + strFromArray);

        //Task2:
        String str1 = "abc";

        if (isThreeLetterAlphabet(str1)) {
            System.out.println("The string contains exactly 3 alphabet characters.");
        } else {
            System.out.println("The string does not contain exactly 3 alphabet characters.");
        }

        //Task3:
        String str2 = "";

        if (isEmptyString(str2)) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }

        //Task4:
        String testStr1 = "HelloWorld";
        String testStr2 = "World";

        boolean endsWith = checkEndsWith(testStr1, testStr2);
        System.out.println("Does \"" + testStr1 + "\" end with \"" + testStr2 + "\"? " + endsWith);

        //Task5:
        Random random = new Random();
        int randomNumber = random.nextInt(21) + 10;
        System.out.println("Random number between 10 and 30: " + randomNumber);

        //Task6:
        double fraction = 0.547;
        double roundedFraction = roundToNearest100(fraction);
        System.out.println("Original Fraction: " + fraction);
        System.out.println("Rounded to Nearest 100: " + roundedFraction);
    }

    //Task2 function:
    public static boolean isThreeLetterAlphabet(String str) {
        if (str.length() != 3) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    //Task3 function:
    public static boolean isEmptyString(String str) {
        return str.isEmpty();
    }

    //Task4 function:
    public static boolean checkEndsWith(String str1, String str2) {
        boolean result = str1.endsWith(str2);
        return result;
    }

    //Task 6 function:
    public static double roundToNearest100(double fraction) {
        double multiplied = fraction * 100;
        double rounded = Math.round(multiplied);
        double result = rounded / 100;

        return result;
    }
}
