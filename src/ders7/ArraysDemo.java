package ders7;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 21;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 51;

        int sumOfNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfNumbers += numbers[i];
        }
        System.out.println(sumOfNumbers);

        System.out.println("-----------------------------------");

        double average = sumOfNumbers / numbers.length;
        System.out.println(average);

        System.out.println("-----------------------------------");

        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println(minNumber);

        System.out.println("----------------------------------");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==1){
                System.out.println(numbers[i]);
            }
        }
    }
}
