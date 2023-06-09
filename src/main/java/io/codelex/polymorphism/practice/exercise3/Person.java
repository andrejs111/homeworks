package io.codelex.polymorphism.practice.exercise3;

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected String address;
    protected int numberID;

    public Person(String firstName, String lastName, String address, int numberID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.numberID = numberID;
    }
    public Person() {
    }

    public String display() {
        return toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberID() {
        return numberID;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", numberID=" + numberID +
                '}';
    }
}
