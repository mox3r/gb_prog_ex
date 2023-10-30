package Task2;

import java.util.Random;

public class Freelancer extends Employee {
    /**
     * Работник с почасовой оплатой
     * TODO: ДОдумать
     */

    public Freelancer(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);

    }

    Random rnd = new Random();

    private int workedTime() { // Отработанное время в найме
        return rnd.nextInt(50, 120);
    }

    @Override
    public double calculateSalary() { // Оклад фрилансера, в данной итерации - по отработанному в найме времени.

        return (salary / 168) * workedTime();
    }

    @Override
    public String toString() {
        return String.format("%s %s\t - возраст: %d - фрилансер\t - месячная з/п за %d часов: %.2f руб", getSurName(),
                getName(), getAge(), workedTime(), calculateSalary());
    }

}
