package com.company.devices;

public class Car extends Device {
    public Double engineVolume;
    public String plates;
    public Double value;

    public Car(String producer, String model, Integer prodYear, String colour) {
        super(producer, model, prodYear, colour);
        this.engineVolume = 1.9;
        this.value = 0.0;
        this.plates = "GD 08D30";
    }

    @Override
    public void turnOn() {
        System.out.println("Kluczyk w stacyjce");
        System.out.println("Rozrusznik kreci sie");
        System.out.println("Silnik jest uruchomiony");
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
