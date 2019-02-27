package com.leena.spring.dependency.constructor.type3;



public class CreditPayment implements IPayment {

    public void executePayment() {

        System.out.println("Performing credit payment");
    }
}