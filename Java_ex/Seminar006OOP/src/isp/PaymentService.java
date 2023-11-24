package isp;

public interface PaymentService {
    void payWebMoney(int amount);

    void payCreditCard(int amount);

    void payPhoneNumber(int amount);
}
