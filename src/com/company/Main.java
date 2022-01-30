package com.company;

public class Main {

    public static void main(String[] args) {

        Human student = new Human("Wlodek", "Gajewski", 22);
        Human teacher = new Human("Jan", "Kowalski", 45);

        Animal dog = new Animal("Pies");
        Animal dog1 = new Animal("Pies");
        Animal cat = new Animal("Kot");

        Car citroen = new Car("C5", "PSA", "Blue", 2010);
        Car peugeot = new Car("407", "PSA", "Gold", 2008);
        student.car = citroen;
        teacher.car = peugeot;


        System.out.println("################");
        System.out.println("#####Czlowiek###");
        System.out.println("################");
        System.out.println("Imie: " + student.firstName);
        System.out.println("Nazwisko: " + student.lastName);
        System.out.println("Wiek: " + student.age + " lat");
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
        System.out.println("Model auta: " + student.car.model);
        System.out.println("Producent auta: " + student.car.producer);
        System.out.println("Kolor auta: " + student.car.colour);
        System.out.println("Rok produkcji auta: " + student.car.prodYear);

        System.out.println("################");
        System.out.println("#####Czlowiek###");
        System.out.println("################");
        System.out.println("Imie: " + teacher.firstName);
        System.out.println("Nazwisko: " + teacher.lastName);
        System.out.println("Wiek: " + teacher.age + " lat");

        System.out.println("################");
        System.out.println("#####Auto#######");
        System.out.println("################");
        System.out.println("Model auta: " + teacher.car.model);
        System.out.println("Producent auta: " + teacher.car.producer);
        System.out.println("Kolor auta: " + teacher.car.colour);
        System.out.println("Rok produkcji auta: " + teacher.car.prodYear);

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
