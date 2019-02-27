package com.leena.spring.dependency.constructor.type1;


public class CashPayment implements IPayment{

    public void executePayment(int amount) {

        System.out.println("Perform Cash Payment - " + amount);
    }
}


