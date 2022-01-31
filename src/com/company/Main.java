package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Human Jan = new Human();
        Human Anna = new Human();

        Diesel citroen = new Diesel("Citroen", "C5", 2010, "Blue");
        Electric renault = new Electric("Renault", "Clio", 2020, "White");
        Electric tesla = new Electric("Tesla", "S", 2021, "White");

        citroen.value = 10000.00;
        renault.value = 8000.00;
        tesla.value = 100000.0;
        Jan.cash = 10000.00;
        Anna.cash = 30000.00;
        Jan.salary = 1000000.00;
        Anna.salary = 1000000.00;

        Jan.firstName = "Jan";
        Jan.lastName = "Kowalski";
        Jan.age = 23;
        Anna.firstName = "Anna";
        Anna.lastName = "Nowak";
        Anna.age = 45;

        System.out.println("######################");
        System.out.println("########Dodanie#######");
        System.out.println("######################");
        Jan.addCar(citroen);
        citroen.carOwners();
        System.out.println("######################");
        System.out.println("######Wlasciciel######");
        System.out.println("######################");
        Jan.setCar(citroen, 1);
        citroen.carOwners();
        System.out.println("######################");
        System.out.println("#######Sprzedaz#######");
        System.out.println("######################");
        citroen.Sale(Jan, Anna, 1000.0);
        citroen.carOwners();
        System.out.println("######################");
        System.out.println("######Wlasciciele#####");
        System.out.println("######################");
        System.out.println("Wlasciciele? " + citroen.checkOwners());
        System.out.println("Wlasciciele? " + tesla.checkOwners());









           /*

        System.out.println("######################");
        Jan.addCar(citroen);
        Jan.addCar(tesla);
        Jan.addCar(renault);
        Jan.addCar(citroen);
        Jan.addCar(tesla);
        Jan.addCar(renault);
        System.out.println("######################");
        Jan.removeCar(tesla);
        System.out.println("######################");
        System.out.println(Jan.Car(citroen));
        System.out.println(Jan.getGarageValue());
        System.out.println("######################");
        Anna.addCar(citroen);
        Anna.addCar(tesla);
        Anna.addCar(renault);
        System.out.println("######################");
        citroen.Sale(Jan, Anna, 10000.0);
        System.out.println("######################");
        Jan.cash = 100.0;
        Anna.cash = 10000.0;
        System.out.println("Ilosc pieniedzy Jana przed sprzedaza: " + Jan.cash);
        System.out.println("Ilosc pieniedzy Anny przed kupnem: " + Anna.cash);

        citroen.Sale(Jan, Anna, 10000.0);
        System.out.println("######################");




        Phone samsung = new Phone("Samsung", "Android", 2021, 6.0, 16);
        samsung.installAnApp("WhatsApp");
        samsung.installAnApp("Snake", "v1.00");

        System.out.println("######################");
        System.out.println("#####Instalowanie#####");
        System.out.println("######################");
        List<String> apps = new ArrayList<>();
        apps.add("Pasjans");
        apps.add("FlappyBirds");
        samsung.installAnApp(apps);
        System.out.println("###################");
        System.out.println("####Tankowanie#####");
        System.out.println("###################");
        System.out.println(citroen.oil);
        citroen.Refuel();
        System.out.println(citroen.oil);
        System.out.println("##################");
        System.out.println("#####Ladowanie####");
        System.out.println("##################");
        System.out.println(renault.capacitance);
        renault.Refuel();
        System.out.println(renault.capacitance);




        Human student = new Human();
        Human teacher = new Human();
        Human homoSapiens = new Human();

        Pet dog = new Pet("dog");
        Pet cat = new Pet("cat");

        FarmAnimal canis = new FarmAnimal("Canis");
        FarmAnimal pig = new FarmAnimal("Pig");

        System.out.println("Canis");
        canis.beEaten();
        canis.beEaten();

        System.out.println("Kot");
        cat.feed();
        cat.feed(10.0);

        System.out.println("Swinia" );
        pig.feed(20.0);
        pig.beEaten();
        pig.beEaten();



        Human student = new Human("Wlodek", "Gajewski", 22);
        Human teacher = new Human("Jan", "Kowalski", 45);

        Animal dog = new Animal("Pies");
        Animal cat = new Animal("Kot");
        Animal homoSapiens = new Animal("Homo Sapiens");

        Car citroen = new Car("Citroen", "C5", 2010, "Blue");
        Car peugeot = new Car("Peugeot", "407", 2008, "Gold");

        Phone iphone = new Phone("Apple", "IPhone", 2020, 5.8, 8);
        Phone LG = new Phone("LG", "Wing", 2021, 6.0, 12);

        citroen.value = 10000.0;
        peugeot.value = 5000.0;
        student.car = citroen;
        teacher.car = peugeot;


        System.out.println("################");
        System.out.println("###Brak zwierza###");
        System.out.println("################");
        student.cash = 100.0;
        teacher.cash = 1000.0;
        System.out.println("Pieniadze w portfelu nauczyciela: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta: " + student.cash);
        cat.Sale(student, teacher, 10.0);
        System.out.println("Pieniadze w portfelu nauczyciela po zakupie: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta po sprzedazy: " + student.cash);

        System.out.println("################");
        System.out.println("###Jest kot###");
        System.out.println("################");
        student.pet = cat;

        System.out.println("Pieniadze w portfelu nauczyciela: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta: " + student.cash);
        cat.Sale(student, teacher, 10.0);
        System.out.println("Pieniadze w portfelu nauczyciela po zakupie: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta po sprzedazy: " + student.cash);

        System.out.println("################");
        System.out.println("###Telefon###");
        System.out.println("################");
        student.mobile = iphone;
        System.out.println("Pieniadze w portfelu nauczyciela: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta: " + student.cash);
        iphone.Sale(student, teacher, 200.0);
        System.out.println("Pieniadze w portfelu nauczyciela po zakupie: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta po sprzedazy: " + student.cash);

        System.out.println("################");
        System.out.println("###Czlowiek!###");
        System.out.println("################");
        student.pet = homoSapiens;
        homoSapiens.Sale(student, teacher, 100.0);



/////////////////////////////

        System.out.println("################");
        System.out.println("###Wlaczanie telefonu###");
        System.out.println("################");
        iphone.turnOn();
        System.out.println("################");
        LG.turnOn();

        System.out.println("################");
        System.out.println("###Odpalanie auta###");
        System.out.println("################");
        citroen.turnOn();
        System.out.println("################");
        peugeot.turnOn();


        System.out.println("################");
        System.out.println("###Kupno auta###");
        System.out.println("################");
        student.setSalary(500.0);
        student.setCar(citroen);
        System.out.println("################");
        student.setSalary(3500.0);
        student.setCar(peugeot);
        System.out.println("################");
        student.setSalary(12000.00);
        student.setCar(citroen);

        System.out.println("################");
        System.out.println("#####Czlowiek###");
        System.out.println("################");
        System.out.println(student);

        System.out.println("################");
        System.out.println("#####Pensja#####");
        System.out.println("################");
        student.setSalary(0.0);
        System.out.println(student.getSalary());
        student.setSalary(-1.0);
        System.out.println(student.getSalary());
        student.setSalary(100.0);
        System.out.println(student.getSalary());

        System.out.println("################");
        System.out.println("#####Auto#######");
        System.out.println("################");
        System.out.println(citroen);

        System.out.println("################");
        System.out.println("#####Czlowiek###");
        System.out.println("################");
        System.out.println(teacher);

        System.out.println("################");
        System.out.println("#####Auto#######");
        System.out.println("################");
        System.out.println(peugeot);


        System.out.println("################");
        System.out.println("####Zwierzeta###");
        System.out.println("################");
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        cat.feed();
        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        System.out.println(cat);
        System.out.println(dog);


        System.out.println("################");
        System.out.println("####Telefony####");
        System.out.println("################");
        System.out.println(iphone);
        System.out.println(LG);


         */
    }
}
