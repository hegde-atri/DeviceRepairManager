package com.company;

public class Person {

    protected String firstName;
    protected String lastName;
    protected String phNumber;
    protected String email;
    protected String zipCode;

    public Person(String firstName, String lastName, String phNumber, String email, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phNumber = phNumber;
        this.email = email;
        this.zipCode = zipCode;
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

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

