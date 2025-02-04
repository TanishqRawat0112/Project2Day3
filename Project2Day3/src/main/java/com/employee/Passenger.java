package com.employee;

public class Passenger  {
    public String firstName;
    public String lastName;
    public String gender;
    public int age;
    public String travelClass;
    public String confirmationNumber;

    Passenger(String firstName, String lastName, String gender, int age, String travelClass, String confirmationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.travelClass = travelClass;
        this.confirmationNumber = confirmationNumber;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }
}
