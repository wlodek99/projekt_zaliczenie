package com.company;

public class Car {
    final String model;
    final String producer;
    public String colour;
    public String engineVolume;
    public String plates;
    public Integer prodYear;
    public Double value;

    public Car(String model, String producer, String colour, Integer prodYear) {
        this.model = model;
        this.producer = producer;
        this.colour = colour;
        this.prodYear = prodYear;
        this.value = 0.0;
    }
}
