package com.csulb.cecs575.paymentsystem;

public class PaymentGateway {
    /*Gateway that provide objective instantiation for respective payment type*/
    public Payment getPaymentMethod(PaymentType paymentType) {
        if (paymentType == PaymentType.CREDIT_CARD) {
            //object instantiated for CreditCardPayment
            return new CreditCardPayment();
        } else if (paymentType == PaymentType.GOOGLE_PAYMENT) {
            //object instantiated for GooglePayment
            return new GooglePayment();
        } else {
            throw new IllegalArgumentException("Invalid payment method.");
        }
    }
}
