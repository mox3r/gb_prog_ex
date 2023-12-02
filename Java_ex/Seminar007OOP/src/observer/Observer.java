package observer;

public interface Observer {
    void receiveOffer(String companyName, JobType jobType, int salary);
}
