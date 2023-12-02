package observer;

public class Master implements Observer {
    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, JobType jobType, int salary) {
        System.out.println("Мастер реагирует");
        switch (jobType) {
            case Middle:
                if (this.salary <= salary) {
                    System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Специалист %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                }
                break;
            case Senior:
                if (this.salary <= salary) {
                    System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Специалист %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                }
                break;
            case TeamLead:
                if (this.salary <= salary) {
                    System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Специалист %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                }
                break;
            default:
                break;
        }

    }

}
