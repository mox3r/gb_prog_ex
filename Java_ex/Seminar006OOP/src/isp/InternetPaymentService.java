package isp;

public class InternetPaymentService extends PaymentSrv implements WebMoneyPaymentService, PhoneNumberPaymentService, CreditCardPaymentService {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("InternetProvider pay by WebMoney %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("InternetProvider pay by credit card %d", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("InternetProvider pay by phone number %d", amount);
    }

}
