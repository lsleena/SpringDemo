package com.leena.spring.dependency.setter;

import com.leena.spring.dependency.constructor.type1.IPayment;

public class CashPayment implements IPayment {

    public void executePayment(int amount) {

        System.out.println("Perform Cash Payment with Setter Dependency Injection - " + amount);
    }
}