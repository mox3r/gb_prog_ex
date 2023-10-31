package Task1;

public class CreditAccout<T extends PersonalData> extends Account<T> {

    public CreditAccout(T data, double amount) {
        super(data, amount);

    }

}
