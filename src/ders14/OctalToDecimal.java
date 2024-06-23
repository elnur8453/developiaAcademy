package ders14;

public class OctalToDecimal {
    public static void main(String[] args) {
        String octalNumber = "2456";
        int decimal = Integer.parseInt(octalNumber,8);
        System.out.println(decimal);
    }
}
