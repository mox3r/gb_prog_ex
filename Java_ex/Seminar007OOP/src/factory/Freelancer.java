package factory;

public class Freelancer extends Employee {

    public Freelancer(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    ;
    }

    @Override
    public double calculateSalary() {
        return salary * 20 * 8;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %d; Заработная плата %.2f",
                surName, name, age, calculateSalary());
    }

}
