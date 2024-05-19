package ders8;

public class Person {
    public String name;
    protected int age;
    double height;
    private double weight;

    // Static variable
    public static String country = "Unknown";

    // Public constructor
    public Person(String name) {
        this.name = name;
    }

    // Protected constructor
    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Package-private constructor
    Person(double height) {
        this.height = height;
    }

    // Private constructor
    private Person(double weight, boolean isWeight) {
        this.weight = weight;
    }

    // Methods with different access modifiers
    public void setName(String name) {
        this.name = name;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    void setHeight(double height) {
        this.height = height;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    // Method with final parameter
    public void updateCountry(final String newCountry) {
        Person.country = newCountry;
    }

    // Getter method for age
    public int getAge() {
        return this.age;
    }


}
