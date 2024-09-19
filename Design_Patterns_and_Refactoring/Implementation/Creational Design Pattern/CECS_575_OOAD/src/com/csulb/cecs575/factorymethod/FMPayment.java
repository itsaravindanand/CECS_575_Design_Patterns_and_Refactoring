package com.csulb.cecs575.factorymethod;

public class FMPayment {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();

        Payment paymentMethod = paymentFactory.getPaymentMethod(PaymentType.CREDIT_CARD);
        System.out.println("Payment method for type " + PaymentType.CREDIT_CARD);
        paymentMethod.processPayment(100);

        paymentMethod = paymentFactory.getPaymentMethod(PaymentType.GOOGLE_PAYMENT);
        System.out.println("Payment method for type " + PaymentType.GOOGLE_PAYMENT);
        paymentMethod.processPayment(100);
    }
}
