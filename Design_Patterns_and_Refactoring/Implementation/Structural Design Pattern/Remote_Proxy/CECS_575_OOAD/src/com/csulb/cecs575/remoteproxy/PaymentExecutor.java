package com.csulb.cecs575.remoteproxy;

import com.csulb.cecs575.paymentsystem.PaymentType;

public class PaymentExecutor {
    /*Processing Payments Using Remote Proxy Design Pattern*/

    public static void main(String[] args) {
        //Credit Card Payment by creating an object for RemoteProxyPaymentProcessor with Payment Type: Credit Card
        System.out.println("Credit Card Payment using Remote Proxy Method");
        RemoteProxyPayProcessor CreditCardProxy = new RemoteProxyPayProcessor(PaymentType.CREDIT_CARD);
        CreditCardProxy.processPayment(60.7);

        //Google Payment by creating an object for RemoteProxyPaymentProcessor with Payment Type: Google Payment
        System.out.println("\nGoogle Payment using Remote Proxy Method");
        RemoteProxyPayProcessor GooglePayProxy = new RemoteProxyPayProcessor(PaymentType.GOOGLE_PAYMENT);
        GooglePayProxy.processPayment(85.5);
    }
}
