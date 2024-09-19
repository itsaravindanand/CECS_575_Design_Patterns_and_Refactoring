package com.csulb.cecs575.factorymethod;

public class PaymentFactory {
    public Payment getPaymentMethod(PaymentType paymentType) {
        if (paymentType == PaymentType.CREDIT_CARD) {
            return new CreditCardPayment();
        } else if (paymentType == PaymentType.GOOGLE_PAYMENT) {
            return new GooglePayment();
        } else {
            throw new IllegalArgumentException("Invalid payment method.");
        }
    }
}
