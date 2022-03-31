package com.ahmetkaanmonun;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){

        this("Default name",50000.00,"default@email.com");

    }
    public VipCustomer(String name,double creditLimit){

        this(name,creditLimit,"default@email.com");

    }
    public VipCustomer(String name,double creditLimit,String emailAddress){

        this.setName(name);
        this.setCreditLimit(creditLimit);
        this.setEmailAddress(emailAddress);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
