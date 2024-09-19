package com.csulb.cecs575.factorymethod;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    @Override
    public void processPayment(double amount) {
        // validate necessary info is provided
        // implementation of credit card payment processing
        System.out.println("Processing payment using credit card");
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
