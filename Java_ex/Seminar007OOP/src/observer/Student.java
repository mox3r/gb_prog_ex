package observer;

public class Student extends Employee {
    private String name;
    private String surName;
    private int salary = 4000;

    public Student(String surName, String name) {
        super(surName, name);
        this.surName = surName;
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, JobType jobType, int salary) {
        System.out.println("Студент реагирует");
        switch (jobType) {
            case Junior:
                if (this.salary <= salary) {
                    System.out.printf("Студент %s %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Студент %s %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                }
                break;
            case Intern:
                if (this.salary <= salary) {
                    System.out.printf("Студент %s %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Студент %s %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            surName, name, companyName, salary);
                }
                break;
            default:
                break;
        }

    }
}
