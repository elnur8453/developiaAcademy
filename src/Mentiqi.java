package ders3;

public class Mentiqi {
    public static void main(String[] args) {
        boolean hasJob = false;
        boolean hasHome = true;
        int a = 2;
        if (!hasJob || hasHome && a++==2){
            System.out.println("buyur kec");
        }
        else{
            System.out.println("olmaz");
        }
        System.out.println(a);
    }
}
