package Task2;

public class Worker extends Employee {
    /**
     * Работник на полную ставку(з/п фикс)
     * 
     * @param surName фамилия
     * @param name    Имя
     * @param age     Возраст
     * @param salary  Ставка
     */

    public Worker(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);

    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s\t - возраст: %d - рабочий\t - месячная з/п: %.2f руб", getSurName(), getName(),
                getAge(), calculateSalary());
    }
}
