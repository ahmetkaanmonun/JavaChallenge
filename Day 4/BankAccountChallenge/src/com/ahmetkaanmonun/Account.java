package com.ahmetkaanmonun;

public class Account {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String phoneNumber;

    public Account(int accountNumber,int balance,String customerName,String phoneNumber){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;


    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(int depositFund){

        this.balance += depositFund;
        System.out.println("New balance is " + this.balance);

    }
    public void withdrawFunds(int withdrawFund){

        if (withdrawFund > this.balance){

            System.out.println("Only " + this.balance +  "Withdrawal not processed");


        }

        this.balance-= withdrawFund;
        System.out.println("Withdrawal " + withdrawFund + " amount processed" + " Remaining balance : " + this.balance);




    }

}
