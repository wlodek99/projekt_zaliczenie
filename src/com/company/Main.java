package com.company;

public class Main {

    public static void main(String[] args) {

        Human student = new Human("Wlodek", "Gajewski", 22);
        Human teacher = new Human("Jan", "Kowalski", 45);

        System.out.println("################");
        System.out.println("Imie: " + student.firstName);
        System.out.println("Nazwisko: " + student.lastName);
        System.out.println("Wiek: " + student.age + " lat");
        System.out.println("################");
        System.out.println("Imie: " + teacher.firstName);
        System.out.println("Nazwisko: " + teacher.lastName);
        System.out.println("Wiek: " + teacher.age + " lat");
        System.out.println("################");


        Animal dog = new Animal("Pies");
        Animal dog1 = new Animal("Pies");
        Animal cat = new Animal("Kot");

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

        student.setPet(dog);
        teacher.setPet(dog1);
        System.out.println(student.getPet().species);
        student.pet.feed();
        student.pet.takeForAWalk();
        System.out.println("#####################");
        System.out.println(teacher.getPet().species);
        teacher.pet.feed();
        teacher.pet.takeForAWalk();



        Phone iphone = new Phone("iphone",5.3, "ios", "black", 8);
        Phone samsung = new Phone("samsung",6.0, "Android", "white", 8);

        System.out.println("Model: " + iphone.model);
        System.out.println("Kolor: " + iphone.colour);
        System.out.println("Ekran: " + iphone.screenSize);
        System.out.println("OS: " + iphone.os);
        System.out.println("Pamiec RAM: " + iphone.ramSize + "GB");
        System.out.println("####################");
        System.out.println("Model: " + samsung.model);
        System.out.println("Kolor: " + samsung.colour);
        System.out.println("Ekran: " + samsung.screenSize);
        System.out.println("OS: " + samsung.os);
        System.out.println("Pamiec RAM: " + samsung.ramSize + "GB");
        System.out.println("#####################");
    }
}
