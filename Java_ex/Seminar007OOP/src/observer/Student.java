package observer;

public class Student implements Observer {
    private String name;
    private int salary = 4000;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, JobType jobType, int salary) {
        System.out.println("Студент реагирует");
        switch (jobType) {
            case Junior:
                if (this.salary <= salary) {
                    System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Студент %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                }
                break;
            case Intern:
                if (this.salary <= salary) {
                    System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Студент %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                }
                break;
            default:
                break;
        }

    }
}
