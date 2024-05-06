package ders5;

public class ClassAndObjectAndConstructorsHome {
    public static void main(String[] args) {
        Employee employee_1 = new Employee();
        Employee employee_2 = new Employee("Elmir");
        Employee employee_3 = new Employee("Gulzar","Memmedov");
        Employee employee_4 = new Employee("Ferid","+994709667887",12_000);

        System.out.println(employee_1);
        System.out.println(employee_2.name);
        System.out.println(employee_3.name);
        System.out.println(employee_3.surname);
        System.out.println(employee_4.name);
        System.out.println(employee_4.phone);
    }
}
