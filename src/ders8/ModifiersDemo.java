package ders8;

public class ModifiersDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John"); // Using public constructor
        Person person2 = new Person("Doe", 30); // Using protected constructor
        Person person3 = new Person(175.5); // Using default (package-private) constructor

        System.out.println("Name: " + person1.name);

        person1.setAge(25);
        System.out.println("Age: " + person1.getAge());

        System.out.println("Static variable: " + Person.country);
    }
}
