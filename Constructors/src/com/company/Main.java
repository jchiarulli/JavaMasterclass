package com.company;

public class Main {

    public static void main(String[] args) {

//        Bank customer1 = new Bank();
//        customer1.setAccountNumber(12345678);
//        System.out.println("Account Number is " + customer1.getAccountNumber());
//
//        customer1.setBalance(100.50);
//        System.out.println("Balance is " + customer1.getBalance());
//
//        customer1.setCustomerName("Samson");
//        System.out.println("Customer Name is " + customer1.getCustomerName());
//
//        customer1.setEmail("samson@dog.com");
//        System.out.println("Email is " + customer1.getEmail());
//
//        customer1.setPhoneNumber("6092204890");
//        System.out.println("Phone Number is " + customer1.getPhoneNumber());
//
//        customer1.deposit(100.50);
//
//        customer1.withdraw(100.50);

//        Account bobsAccount = new Account();
//        Account bobsAccount = new Account("12345", 0.00,
//                "Bob Brown", "myemail@bob.com",
//                "(887) 123-4567");

//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccount = new Account("Tim",
//                "tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer samson = new VipCustomer();
        System.out.println("Name: " + samson.getName() + " Credit Limit: " +
                samson.getCreditLimit() + " Email Address " + samson.getEmailAddress());

        VipCustomer abby = new VipCustomer("Abby", 45678.67);
        System.out.println("Name: " + abby.getName() + " Credit Limit: " +
                abby.getCreditLimit() + " Email Address " + abby.getEmailAddress());

        VipCustomer charles = new VipCustomer("Charles", 30987.56, "charles@charles.com");
        System.out.println("Name: " + charles.getName() + " Credit Limit: " +
                charles.getCreditLimit() + " Email Address " + charles.getEmailAddress());
    }
}
