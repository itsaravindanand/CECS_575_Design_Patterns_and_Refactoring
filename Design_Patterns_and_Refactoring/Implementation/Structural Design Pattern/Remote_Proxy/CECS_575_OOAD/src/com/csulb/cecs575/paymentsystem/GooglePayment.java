package com.csulb.cecs575.paymentsystem;

public class GooglePayment implements Payment {
    /*Google Payment Processing Implementation*/
    private String email;
    private String password;
    private String mobile;
    @Override
    public void processPayment(double amount) {
        // validate Google Payment Account details
        // implementation of Google payment processing
        System.out.println("Processing Google Payment Transaction of $" +amount+ " Contacting Bank Server");
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
