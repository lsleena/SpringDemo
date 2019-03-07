package com.leena.spring.autoWiring.usingAutowired;


public class CashPayment1 implements IPayment1 {

    public void executePayment() {

        System.out.println("Perform Cash Payment for amount ... " );
    }
}