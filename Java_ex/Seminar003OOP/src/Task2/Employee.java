package Task2;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private String surName;
    private int age;

    public int getAge() {
        return age;
    }

    protected double salary;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Employee(String surName, String name, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    /**
     * З/п формула для каждого своя вернёт з/п в месяц
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s\t - возраст: %d\t- ставка: %.2f руб., з/п в месяц: %.2f руб.\n",
                surName, name, age, salary, calculateSalary());
    }

    /**
     * построение работников в соответствии с "Фамилия + имя"
     */
    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0) {
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
