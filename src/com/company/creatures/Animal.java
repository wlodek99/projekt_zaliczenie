package com.company.creatures;

import com.company.Salleable;

public abstract class Animal implements Salleable, Feedable {
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_DOG_WEIGHT = 7.0;
    private static final Double DEFAULT_WEIGHT = 1.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    public Double weight;
    final String species;
    public Boolean isAlive;

    public Animal(String species){
        this.isAlive = true;
        this.species = species;
        if(this.species.equals("cat")){
            this.weight = DEFAULT_CAT_WEIGHT;
        }else if(this.species.equals("dog")){
            this.weight = DEFAULT_DOG_WEIGHT;
        }else{
            this.weight = DEFAULT_WEIGHT;
        }
    }
    @Override
    public void feed(){
        this.feed(DEFAULT_FOOD_WEIGHT);
        System.out.println("Mmm jedzonko");
    }

    @Override
    public void feed(Double foodWeight) {
        if (this.isAlive){
            this.weight += foodWeight;
            System.out.println("thx 4 food, ");
            System.out.println("Zwierz nakarmiony, " + foodWeight + "kg");
        } else {
            System.out.println("too late wybacz");
        }
    }

    public void takeForAWalk(){
        if(this.isAlive){
            this.weight -= 1.0;
            System.out.println("Mmm spacerek!");
            if(this.weight == 0 ){
                this.isAlive = false;
            }
        }else{
            System.out.println("Halo policja, zwierz zdechl");
        }
    }

    @Override
    public void Sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price){
            System.out.println("Wybacz, nie stac cie");
        } else if (seller.pet != this){
            System.out.println("Nie masz zwierzaka na sprzedaz");
        } else if(seller.pet.species.equals("Homo Sapiens")){
            System.out.println("Mam cie zglosic za handel ludzmi?");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("sprzedales zwierze za " + price + " zl");
        }
    }

    public String toString(){
        return  "Gatunek: " + species + " waga: " + weight + " kg";
    }

}
