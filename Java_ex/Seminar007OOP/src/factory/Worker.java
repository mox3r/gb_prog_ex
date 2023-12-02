package factory;

public class Worker extends Employee {

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {        
        return String.format("%s %s; Рабочий; Возраст: %d; Заработная плата %.2f", surName, name, age, salary);
    }
    
}
