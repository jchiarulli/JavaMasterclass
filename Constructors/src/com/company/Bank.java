package com.company;

public class Bank {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
      this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
       this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
        System.out.println("Your updated balance is: $" + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if(this.balance >= withdrawAmount) {
            this.balance = this.balance - withdrawAmount;
            System.out.println("Your updated balance is: $" + this.balance);
        } else {
            System.out.println("Insufficient Funds!");
        }
    }
}
