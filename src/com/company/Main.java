package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

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





        /*

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
