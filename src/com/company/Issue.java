package com.company;
import java.time.*;
import java.util.ArrayList;

public class Issue {

    public String id;
    public LocalDateTime initialDate;
    public LocalDateTime deliveryDate;
    public String status;
    public User customer;

    public Issue(String id, LocalDateTime initialDate, String status, User customer){
        this.id = id;
        this.initialDate = initialDate;
        this.status = status;
        this.customer = customer;
    }


    @Override
    public String toString() {
        return id + '\'' + ", initialDate = " + initialDate + ", deliveryDate = " + deliveryDate +  status + '\'' + ", customer = " + customer;
    }

    public Technician getTechnician(ArrayList<Technician> techList){
        for(Technician tech : techList){
            for(Device d: tech.deviceList){
                if(d.id.equals(customer.userDevice.id)){
                    return tech;
                }
            }
        }

        return null;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
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
