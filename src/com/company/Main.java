package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    /*
    Program which manages IT repairs to devices. It can:
    --> Enter a new device
    --> Assign the device to a user
    --> Raise issues with a device
    --> Track issues with a device
    --> Track the repair status of a device
    --> Assign a repair to a technician
    --> Update the status of a device
    --> Remove a device from the system
     */

    public ArrayList<Technician> myTechnicians = new ArrayList<Technician>();
    public ArrayList<Issue> myIssues = new ArrayList<Issue>();

    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();

        Main m = new Main();
        m.myTechnicians.add(new Technician("Atri", "Hegde", "5454658768", "iamatrihegde@gmail.com", "RH11ET"));
        m.myTechnicians.add(new Technician("Atri1", "Hegde", "5454658768", "iamatrihegde@gmail.com", "RH11ET"));
        m.myTechnicians.add(new Technician("Atri2", "Hegde", "5454658768", "iamatrihegde@gmail.com", "RH11ET"));
        m.myIssues.add(new Issue("bruh", d, "not finished", new User("customer1", "Hegde", "5454658768", "iamatrihegde@gmail.com", "RH11ET")));
        m.myIssues.add(new Issue("bruh", d, "not finished", new User("customer2", "Hegde", "5454658768", "iamatrihegde@gmail.com", "RH11ET")));
        m.myIssues.add(new Issue("bruh", d, "not finished", new User("customer3", "Hegde", "5454658768", "iamatrihegde@gmail.com", "RH11ET")));

        m.myIssues.get(0).setStatus("in progress");
        m.myIssues.get(1).setStatus("closed");


        for(Issue x : m.myIssues){
            System.out.println(x.toString());
        }





    }

}
