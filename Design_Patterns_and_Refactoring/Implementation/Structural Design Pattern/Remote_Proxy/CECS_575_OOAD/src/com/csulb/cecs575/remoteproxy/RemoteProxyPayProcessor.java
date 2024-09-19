package com.csulb.cecs575.remoteproxy;

import com.csulb.cecs575.paymentsystem.Payment;
import com.csulb.cecs575.paymentsystem.PaymentGateway;
import com.csulb.cecs575.paymentsystem.PaymentType;

public class RemoteProxyPayProcessor implements Payment{
    private Payment payment;
    private final PaymentType PAYMENT_TYPE;
    private final PaymentGateway PAYMENT_GATEWAY;

    public RemoteProxyPayProcessor(PaymentType PAYMENT_TYPE) {
        this.PAYMENT_TYPE = PAYMENT_TYPE;
        this.PAYMENT_GATEWAY = new PaymentGateway();
    }
    @Override
    public void processPayment(double amount) {
        // Perform any necessary pre-processing
        System.out.println("Perform necessary pre-processing steps such as validation");
        if(payment == null) {
            payment = PAYMENT_GATEWAY.getPaymentMethod(PAYMENT_TYPE);
        }
        // Forward the request to the respective payment processor
        payment.processPayment(amount);
        // Perform any necessary post-processing
        System.out.println("Payment Successful!!!");
        System.out.println("Perform necessary post-processing steps such as transaction notification");
    }
}
