package com.csulb.cecs575.paymentsystem;

public class FMPayment {
    /*Processing Payments Using Factory Method Design Pattern*/

    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();

        Payment paymentMethod = paymentGateway.getPaymentMethod(PaymentType.CREDIT_CARD);
        System.out.println("Payment method for type " + PaymentType.CREDIT_CARD);
        paymentMethod.processPayment(100);

        paymentMethod = paymentGateway.getPaymentMethod(PaymentType.GOOGLE_PAYMENT);
        System.out.println("Payment method for type " + PaymentType.GOOGLE_PAYMENT);
        paymentMethod.processPayment(100);
    }
}
