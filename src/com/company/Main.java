package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human student = new Human("Wlodek", "Gajewski", 22);
        Human teacher = new Human("Jan", "Kowalski", 45);

        Animal dog = new Animal("Pies");
        Animal dog1 = new Animal("Pies");
        Animal cat = new Animal("Kot");

        Car citroen = new Car("C5", "PSA", "Blue", 2010);
        citroen.value = 10000.0;
        Car peugeot = new Car("407", "PSA", "Gold", 2008);
        peugeot.value = 5000.0;
        student.car = citroen;
        teacher.car = peugeot;

        Phone iphone = new Phone("iphone",5.3, "IOS", "black", 8);
        Phone Xiaomi = new Phone("Xiaomi",6.0, "Android", "white", 8);


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
        System.out.println(Xiaomi);
    }
}
