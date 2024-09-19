package com.csulb.cecs575.paymentsystem;

public class CreditCardPayment implements Payment {
    /*Credit Card Payment Processing Implementation*/
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    @Override
    public void processPayment(double amount) {
        // validate credit card details
        // implementation of credit card payment processing
        System.out.println("Processing Credit Card Payment of $" +amount+ " Contacting Bank Server");
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getCvv() {
        return cvv;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
}
