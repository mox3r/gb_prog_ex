package isp;

import java.util.ArrayList;
import java.util.List;

public class Prog {
    public static void main(String[] args) {
        
        List<PhoneNumberPaymentService> paymentServices = new ArrayList<>();

        paymentServices.add(new InternetPaymentService());
        //paymentServices.add(new CustomPaymentService());

        for (PhoneNumberPaymentService paymentService : paymentServices){
            paymentService.payPhoneNumber(200);
            break; 
        }
    }
}
