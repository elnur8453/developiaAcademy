package ders4;

public class Diskriminant {
    public static void main(String[] args) {
        double a = 3;
        double b = 5;
        double c = 1;
        double x1 = 0;
        double x2 = 0;

        double disk = b * b - 4 * a * c;
        if (disk == 0) {
            x1 = (-1 * b) / 2 * a;
        } else if (disk < 0) {
            System.out.println("koku yoxdur");
        } else {
            x1=(-b-Math.sqrt(disk))/(2*a);
            x2=(-b+Math.sqrt(disk))/(2*a);
        }
        System.out.println(x1);
        System.out.println(x2);
    }
}
