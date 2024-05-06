package ders5;

public class ClassAndObjectHome {
    public static void main(String[] args) {
        Person person_1 = new Person();
        Person person_2 = new Person();

        person_1.id = 134;
        person_1.name = "Vusal";
        person_1.age = 25;
        person_1.surname = "Ceferov";
        person_1.phone = "+944708068080";

        person_2.id = 265;
        person_2.name = "Nurlan";
        person_2.surname = "Soltanov";
        person_2.phone = "+944704509889";
        person_2.age = 25;

        System.out.println(person_1.id);
        System.out.println(person_1.name);
        System.out.println(person_1.surname);
        System.out.println(person_1.age);
        System.out.println(person_1.phone);
        System.out.println("///////////////////////////////////////");
        System.out.println(person_2.id);
        System.out.println(person_2.name);
        System.out.println(person_2.surname);
        System.out.println(person_2.age);
        System.out.println(person_2.phone);
    }
}
