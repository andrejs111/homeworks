package io.codelex.oop.Exercise2;

public class PersonTest {
    public static void main(String[] args) {

    Employee employee = new Employee("Jānis", "Bērziņš", "198347", 30, "Accountant", "26.05.2022");
    employee.getInfo();
    Customer customer = new Customer("Pēteris", "Ozoliņš", "CID1234", 20);
    customer.getInfo();
    }
}
