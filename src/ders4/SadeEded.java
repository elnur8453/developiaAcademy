package ders4;

public class SadeEded {
    public static void main(String[] args) {
        int eded = 2; // baslangic ededimiz
        int say = 0;  // en son say 34 olacaq

        while (say < 34) {
            boolean ededSadedir = true;
            for (int i = 2; i < eded; i++) { // bolunen ededler
                if (eded % i == 0) {
                    ededSadedir = false;
                    break;
                }
            }
            if (ededSadedir == true) {
                System.out.println(eded);
                say++;
            }
            eded++;
        }
    }
}
