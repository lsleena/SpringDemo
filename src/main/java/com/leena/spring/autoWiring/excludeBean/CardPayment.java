package com.leena.spring.autoWiring.excludeBean;

public class CardPayment implements IMoneyPayment {

    public void executePayment() {

        System.out.println("Perform Card Payment ");
    }
}

