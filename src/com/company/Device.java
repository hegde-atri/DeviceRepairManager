package com.company;

public class Device {

    protected String id;
    protected String name;
    protected String manufacturer;

    public Device(String id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + manufacturer;
    }

}


