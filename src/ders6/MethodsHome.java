package ders6;

public class MethodsHome {
    public static void main(String[] args) {
        MethodsHome methodsHome = new MethodsHome();

        // Using printNumbers method with different arguments
        methodsHome.printNumbers(1, 5);
        methodsHome.printNumbers(10, 15);
        methodsHome.printNumbers(-3, 3);
    }

    public void printNumbers(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
