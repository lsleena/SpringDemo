package com.leena.spring.autoWiring.usingAutowired;

import org.springframework.beans.factory.annotation.Autowired;


public class PayServiceImpl implements IPayService {

    private IPayment payment;

    public void performPayment() {
        // calling method on Ipayment implementing class
        payment.executePayment();
    }

    public IPayment getPayment() {
        return payment;
    }

    @Autowired
    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

}