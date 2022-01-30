package com.company.devices;

import com.company.Human;

public class Car extends Device {
    public Double engineVolume;
    public String plates;
    public Double value;

    public Car(String producer, String model, Integer prodYear, String colour) {
        super(producer, model, prodYear, colour);
        this.engineVolume = 1.9;
        this.value = 0.0;
        this.plates = "GD 123PL";
    }

    @Override
    public void turnOn() {
        System.out.println("Kluczyk w stacyjce");
        System.out.println("Rozrusznik kreci sie");
        System.out.println("Silnik jest uruchomiony");
    }

    @Override
    public void Sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price){
            System.out.println("Wybacz, nie stac cie");
        } else if (seller.car != this){
            System.out.println("Niestety nie masz auta");
        } else{
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Sprzedales auto za: " + price + " zl");
        }
    }

    @Override
    public String toString(){
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", prodYear=" + prodYear +
                ", engineVolume=" + engineVolume +
                ", plates=" + plates +
                ", value='" + value + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }


}
