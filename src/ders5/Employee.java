package ders5;

public class Employee {
    Integer id;
    String name;
    String surname;
    String phone;
    String address;
    int salary;

    public Employee(){

    }

    public Employee(String name) {
        System.out.println("Name is " + name);
        this.name = name;
    }

    public Employee(String name, String surname) {
        System.out.println("Name is " + name);
        System.out.println("Surname is " + surname);
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String phone, int salary) {
        System.out.println("Name is " + name);
        System.out.println("phone is " + phone);
        System.out.println("salary is " + salary);
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }
}
