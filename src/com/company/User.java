package com.company;

public class User extends Person{

    public Device userDevice;


    public User(String firstName, String lastName, String phNumber, String email, String zipCode) {
        super( firstName,  lastName,  phNumber,  email,  zipCode);

    }
}
