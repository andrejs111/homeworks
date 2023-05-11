package io.codelex.myCode;

public class Player {
    private String firstName;
    private String lastName;
    private Guitar guitar;
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Guitar getGuitar() {
        return guitar;
    }


    public void setGuitar(Guitar guitar) {
        this.guitar = guitar;
    }
    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", guitar=" + guitar +
                '}';
    }
}
