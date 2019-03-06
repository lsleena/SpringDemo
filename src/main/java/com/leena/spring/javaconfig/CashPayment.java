package com.leena.spring.javaconfig;

public class CashPayment implements IPayment{


    @Override
    public void executePayment() {

        System.out.println("Performing Cash Payment :\n Withdraw 1000$ cash.");
    }
}
