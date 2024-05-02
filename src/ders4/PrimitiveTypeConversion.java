package ders4;

public class PrimitiveTypeConversion {
    public static void main(String[] args) {
        int intEded1 = 55;
        byte byteEded1 = (byte) intEded1;
        System.out.println(byteEded1);

        short shortEded1 = 636;
        byte byteEded2 = (byte) shortEded1;
        System.out.println(shortEded1);

        long longEded1 = 458;
        short shortEded2 = (short) longEded1;
        System.out.println(shortEded2);

        long longEded2 = 92523635483L;
        int intEded2 = (int) longEded2;
        System.out.println(intEded2);

        double doubleEded1 = 65787.3;
        int intEded3 = (int) doubleEded1;
        System.out.println(intEded3);

        char charEded1 = 'q';
        int intEded4 = (int) charEded1;
        System.out.println(intEded4);

        int intEded5 = 266;
        char charEded2 = (char) intEded5;
        System.out.println(charEded2);

    }
}
