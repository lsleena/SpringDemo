package com.leena.spring.dependency.constructor;


public class CashPayment implements IPayment{

    public void executePayment(int amount) {

        System.out.println("Perform Cash Payment - " + amount);
    }
}


