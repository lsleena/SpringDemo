package com.leena.spring.autoWiring.usingAutowired;

import org.springframework.beans.factory.annotation.Autowired;


public class PayServiceImpl1 implements IPayService1 {

    private IPayment1 payment;

    public void performPayment() {
        // calling method on Ipayment implementing class
        payment.executePayment();
    }

    public IPayment1 getPayment() {
        return payment;
    }

    @Autowired
    public void setPayment(IPayment1 payment) {
        this.payment = payment;
    }

}