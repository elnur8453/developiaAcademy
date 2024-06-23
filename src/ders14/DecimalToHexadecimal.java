package ders14;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int decimal = 94856;
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println(hexadecimal);
    }
}
