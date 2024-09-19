package com.csulb.cecs575.factorymethod;

public class GooglePayment implements Payment {
    private String email;
    private String password;
    private String mobile;
    @Override
    public void processPayment(double amount) {
        // validate necessary info is provided
        // implementation of Google payment processing
        System.out.println("Processing payment using GooglePay");
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getMobile() {
        return mobile;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
