package com.company.devices;

import com.company.creatures.Human;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {
    public Double engineVolume;
    public String plates;
    public Double value;
    public Double oil;
    public Double capacitance;
    public Double gas;
    public List<Human> owners;
    public Human currentOwner;
    public List<String> transactions;
    public List<Human> sellers;
    public List<Human> buyers;

    public Car(String producer, String model, Integer prodYear, String colour) {
        super(producer, model, prodYear, colour);
        this.engineVolume = 1.9;
        this.value = 0.0;
        this.plates = "GD 123PL";
        this.oil = 0.0;
        this.capacitance = 0.0;
        this.gas = 0.0;
        this.owners = new ArrayList<>();
        this.currentOwner = null;
        this.transactions = new ArrayList<>();
        this.sellers = new ArrayList<>();
        this.buyers = new ArrayList<>();
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
        } else if (!seller.Car(this)){
            System.out.println("Niestety nie masz auta");
        } else if (buyer.FreeSpace()) {
            System.out.println("SORRY, NIE MIEJSCA W GARAZU");
        }else if (seller != currentOwner){
                System.out.println("SORRY, NIE JESTES WLASCICIELEM POJAZDU");
        } else{
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            this.owners.add(buyer);
            this.sellers.add(seller);
            this.buyers.add(buyer);
            this.transactions.add("Sprzedal: " + seller.firstName + " kupił: " + buyer.firstName);
            System.out.println("Sprzedales auto za: " + price + " zl");
        }
    }

    public abstract void Refuel();

    public void carOwners(){
        System.out.println("Lista właścicieli: " + this);
        int counter = 1;
        if(owners.size() == 0){
            System.out.println("BRAK WLASCICIELI");
        }else{
            for (Human human : owners) {
                if(counter == owners.size()){
                    this.currentOwner = human;
                    System.out.println(counter + ") " + this.currentOwner + " - Aktualny wlaściciel");
                }else{
                    System.out.println(counter + ") " + human);
                    counter += 1;
                }
            }
        }
    }

    public boolean checkOwners(){
        return owners.size() != 0;
    }

    public boolean checkSelling(Human seller, Human buyer){
        for (int i = 0; i < transactionCount(); i++) {
            if(sellers.contains(seller) && buyers.contains(buyer))
                if(sellers.get(i) == seller && buyers.get(i) == buyer){
                    return true;
                }
        }
        return false;
    }

    public Integer transactionCount(){
        int counter = 0;
        for (String transaction : transactions) {
            counter += 1;
        }
        return counter;
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
