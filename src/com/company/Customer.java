package com.company;

public class Customer extends Person{

    public Device customerDevice;


    public Customer(String firstName, String lastName, String phNumber, String email, String zipCode, Device userDevice) {
        super( firstName,  lastName,  phNumber,  email,  zipCode);
        this.customerDevice = userDevice;

    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + phNumber + " " + email + " " + zipCode + " " + customerDevice.toString();
    }

}
