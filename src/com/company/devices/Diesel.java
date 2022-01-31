package com.company.devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, Integer prodYear, String colour) {
        super(producer, model, prodYear, colour);
    }

    @Override
    public void Refuel() {
        this.oil  = 40.0;
        System.out.println("Zatankowano Diesla " + oil + " l");
    }
}
