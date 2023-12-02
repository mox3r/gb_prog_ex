package observer;

public class Worker implements Observer {

    private String name;
    private int salary = 20000;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, JobType jobType, int salary) {
        System.out.println("Рабочий реагирует");
        switch (jobType) {
            case Cleaner:
                if (this.salary <= salary) {
                    System.out.printf("Рабочий %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Рабочий %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                }
                break;
            case Security:
                if (this.salary <= salary) {
                    System.out.printf("Рабочий %s: Мне нужна эта работа! (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                    this.salary = salary;
                } else {
                    System.out.printf("Рабочий %s: Поищу ещё. (компания: %s; з/п: %d)\n",
                            name, companyName, salary);
                }
                break;
            default:
                break;
        }

    }

}
