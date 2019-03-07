package com.leena.spring.autoWiring.usingAutowired;

import com.leena.spring.autoWiring.usingAutowired.IPayment;

public class CashPayment implements IPayment {

    public void executePayment() {

        System.out.println("Perform Cash Payment for amount ... " );
    }
}