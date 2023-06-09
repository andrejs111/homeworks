package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {

    protected String jobTitle;
    public Employee(String firstName, String lastName, String address, int numberID, String jobTitle) {
        super(firstName, lastName, address, numberID);
        this.jobTitle = jobTitle;
    }

    @Override
    public String display() {
        System.out.println(super.display());
        return super.display();
    }

    @Override
    public String toString() {
        return "Employee: " +
                "jobTitle = '" + jobTitle + '\'' +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", address = '" + address + '\'' +
                ", numberID = " + numberID;
    }
}
