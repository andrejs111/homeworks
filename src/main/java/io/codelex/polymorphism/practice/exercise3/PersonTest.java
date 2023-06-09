package io.codelex.polymorphism.practice.exercise3;


public class PersonTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Jānis", "Pēteris", "Rīgas iela 1", 19938, "IT specialists");
        Student student = new Student("Pēteris", "Jānis", "Rīgas iela 2", 33154, 6.5);
        employee.display();
        student.display();
    }
}
