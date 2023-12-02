package observer;

import java.util.Random;

public class Company {
    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    Random rnd = new Random();

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(EmployeeType employeeType, JobType jobType) {
        int salary = rnd.nextInt(maxSalary);
        jobAgency.sendOffer(name, employeeType, jobType, salary);
    }
}
