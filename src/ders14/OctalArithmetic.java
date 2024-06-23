package ders14;

public class OctalArithmetic {
    public static void main(String[] args) {
        String octalNumber1 = "4561";
        String octalNumber2 = "3572";

        String addOctal = Integer.toOctalString(Integer.parseInt(octalNumber1, 8) + Integer.parseInt(octalNumber2, 8));
        System.out.println(addOctal);
        String subOctal = Integer.toOctalString(Integer.parseInt(octalNumber1, 8) - Integer.parseInt(octalNumber2, 8));
        System.out.println(subOctal);
    }
}
