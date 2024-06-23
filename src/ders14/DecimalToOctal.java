package ders14;

public class DecimalToOctal {
    public static void main(String[] args) {
        String decimalNumber = "2530";
        String octalNumber = Integer.toOctalString(Integer.parseInt(decimalNumber));
        System.out.println(octalNumber);
    }
}
