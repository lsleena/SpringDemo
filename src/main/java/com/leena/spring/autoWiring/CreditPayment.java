package com.leena.spring.autoWiring;

public class CreditPayment implements IPayment {

    public void executePayment(int amount) {

        System.out.println("Perform Credit Payment for amount ... " + amount);
    }
}