package ders14;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        String binaryNumber = "1100110";
        String hexadecimalNumber = Integer.toHexString(Integer.parseInt(binaryNumber,2)).toUpperCase();
        System.out.println(hexadecimalNumber);
    }
}
