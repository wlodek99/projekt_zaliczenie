package com.company;

public class Human {
    public String firstName;
    public String lastName;
    public Integer age;
    public Animal pet;
    public Car car;
    public Double salary;

    public Human(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = 0.0;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }


    public void setSalary(Double salary) {
        if(salary <= 0){
            System.out.println("Czy ja ci wygladam na niewolnika?");
        }else{
            System.out.println("Nowe dane zostaly wyslane do systemu ksiegowego");
            System.out.println("Aneks znajduje sie w dziale kadr");
            System.out.println("ZUS i US został poinformowany o zmianie pensji");
            this.salary = salary;
        }
    }

    public Double getSalary() {
        return salary;
    }

}

