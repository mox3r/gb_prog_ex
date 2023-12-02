package factory;

public abstract class Employee {
    protected String name;
    protected String surName;
    protected double salary;
    protected int age;

    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();
}
