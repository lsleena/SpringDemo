package com.leena.spring.autoWiring;

public class CashPayment implements IPayment {

    public void executePayment(int amount) {

        System.out.println("Perform Cash Payment for amount ... " + amount);
    }
}