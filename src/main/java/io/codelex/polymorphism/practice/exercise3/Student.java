package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {
    protected double gpa;
    public Student(String firstName, String lastName, String address, int numberID, double gpa) {
        super(firstName, lastName, address, numberID);
        this.gpa = gpa;
    }

    @Override
    public String display() {
        System.out.println(super.display());
        return super.display();
    }

    @Override
    public String toString() {
        return "Student: " +
                "GPA = '" + gpa + '\'' +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", address = '" + address + '\'' +
                ", numberID = " + numberID;
    }
}
