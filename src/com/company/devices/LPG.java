package com.company.devices;

public class LPG extends Car{
    public LPG(String producer, String model, Integer prodYear, String colour) {
        super(producer, model, prodYear, colour);

    }

    @Override
    public void Refuel() {
        this.gas  = 60.0;
        System.out.println("Zatankowano gazu: " + gas + " l");
    }
}
