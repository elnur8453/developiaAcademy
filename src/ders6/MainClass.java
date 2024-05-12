package ders6;

public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5.0;

        Calculator calculator = new Calculator();
        calculator.calculateCircleLength(circle);

        System.out.println("Circle's length: " + circle.length);
    }
}
