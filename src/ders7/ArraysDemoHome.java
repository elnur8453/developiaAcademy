package ders7;

import java.util.Arrays;

public class ArraysDemoHome {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 19;
        numbers[1] = 31;
        numbers[2] = 38;
        numbers[3] = 97;

        int sumOfNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfNumbers += numbers[i];
        }
        System.out.println("Sum of numbers: "+sumOfNumbers);

        System.out.println("---------------------------------");

        for(int numbersOfArray: numbers){
            System.out.println("Numbers: "+numbersOfArray);
        }

        System.out.println("---------------------------------");

        double average = sumOfNumbers / numbers.length;
        System.out.println("Average: "+average);

        System.out.println("---------------------------------");

//        int minNumber = numbers[0];
//        for(int numbersOfArray: numbers){
//            if(numbersOfArray < minNumber){
//                minNumber = numbersOfArray;
//            }
//        }
//        System.out.println(minNumber);

//        int max = numbers[0];
//        for(int numbersOfArray: numbers){
//            if(numbersOfArray > max){
//                max = numbersOfArray;
//            }
//        }
        Arrays.stream(numbers).sorted();
        System.out.println("Max number: "+numbers[numbers.length-1]);
        System.out.println("Min number: "+numbers[0]);

        System.out.println("---------------------------------");

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]%2 == 1){
                System.out.println("Odd numbers: "+numbers[i]);
            }
        }
        System.out.println("---------------------------------");

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] % 2 == 0){
                System.out.println("Even numbers: "+numbers[i]);
            }
        }
        System.out.println("---------------------------------");

        boolean primeNumber = true;
        for(int i = 0; i<numbers.length; i++){
            for(int j = 2; j<numbers[i]; j++){
                if(numbers[i] % j==0){
                    primeNumber = false;
                }
            }
            if (primeNumber){
                System.out.println("Prime Numbers: "+numbers[i]);
            }
        }

    }
}