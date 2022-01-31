package com.company.devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer prodYear, String colour) {
        super(producer, model, prodYear, colour);
    }

    @Override
    public void Refuel() {
        this.capacitance  = 20.0;
        System.out.println("Naladowano dokladnie: " + capacitance + "kWh");
    }
}
