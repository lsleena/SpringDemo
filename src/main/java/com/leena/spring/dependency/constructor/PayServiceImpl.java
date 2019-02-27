package com.leena.spring.dependency.constructor;


public class PayServiceImpl implements IPayService {

    private IPayment payment;
    private int amount;
    // Constructor

    PayServiceImpl(IPayment payment, int amount){

        this.payment = payment;
        this.amount = amount;
    }

    public void performPayment() {
        payment.executePayment(amount);
    }
}