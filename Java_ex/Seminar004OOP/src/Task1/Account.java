package Task1;

public abstract class Account<T extends PersonalData> {
    private T data;

    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.format("Клиент: %s; Сумма: %.2f руб.", data, amount);
    }
}
