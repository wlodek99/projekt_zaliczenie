package com.company.devices;

public abstract class Device {
    public String producer;
    public String model;
    public Integer prodYear;
    public String colour;

    public Device(String producer, String model, Integer prodYear, String colour) {
        this.producer = producer;
        this.model = model;
        this.prodYear = prodYear;
        this.colour = colour;
    }

    public abstract void turnOn();

    public String toString(){
        return "";
    }
}