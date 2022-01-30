package com.company.devices;

public class Phone extends Device{
    public Double screenSize;
    public String os;
    public Integer ramSize;


    public Phone(String producer, String model, Integer prodYear, Double screenSize, Integer ramSize){
        super(producer, model, prodYear, "Black");
        this.screenSize = 0.0;
        this.ramSize = 0;
        this.os = "NA";
    }

    @Override
    public void turnOn() {
        System.out.println("Włączanie");
        System.out.println("Waiting...");
        System.out.println("Ladowanie, wyswietla sie logo");
        System.out.println("Waiting...");
        System.out.println("Urzadzenie sie wlaczylo, Witamy");
    }

    @Override
    public String toString(){
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", prodYear=" + prodYear +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

}
