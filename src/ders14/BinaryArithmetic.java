package ders14;

public class BinaryArithmetic {
    public static void main(String[] args) {
        String binaryNumber1 = "111010110";
        String binaryNumber2 = "101010011";

        String addBinary = Integer.toBinaryString(Integer.parseInt(binaryNumber1, 2)+Integer.parseInt(binaryNumber2, 2));
        System.out.println(addBinary);
        String subBinary = Integer.toBinaryString(Integer.parseInt(binaryNumber1, 2)-Integer.parseInt(binaryNumber2, 2));
        System.out.println(subBinary);
    }
}
