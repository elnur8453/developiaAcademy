package ders14;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        String hexadecimal = "BC23";
        String binary = Integer.toBinaryString(Integer.parseInt(hexadecimal, 16));
        System.out.println(binary);
    }
}
