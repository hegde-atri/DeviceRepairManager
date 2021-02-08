package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Issue {

    public String id;
    public LocalDateTime initialDate;
    public LocalDateTime deliveryDate;
    public String status;
    public Customer customer;

    public Issue(String id, LocalDateTime initialDate, String status, Customer customer){
        this.id = id;
        this.initialDate = initialDate;
        this.status = status;
        this.customer = customer;
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return id + " " + initialDate.format(formatter) + " " + status + " " + customer.toString();
    }

    public Technician getTechnician(ArrayList<Technician> techList){
        for(Technician tech : techList){
            for(Device d: tech.deviceList){
                if(d.id.equals(customer.customerDevice.id)){
                    return tech;
                }
            }
        }

        return null;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDateTime initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
