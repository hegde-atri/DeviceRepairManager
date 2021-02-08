package com.company;
import java.util.ArrayList;

public class Technician extends Person{

    public ArrayList<Device> deviceList= new ArrayList<Device>();

    public Technician(String firstName, String lastName, String phNumber, String email, String zipCode) {
        super( firstName,  lastName,  phNumber,  email,  zipCode);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + phNumber + " " + email + " " + zipCode;
    }

}
