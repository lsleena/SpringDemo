package com.leena.spring.autoWiring.usingAutowired;

import org.springframework.beans.factory.annotation.Autowired;

// NO need of setter method when using @Autowired on fields

public class PayServiceImplForField implements IPayService1 {


    @Autowired
    private IPayment1 payment;

    public void performPayment() {
        // calling method on Ipayment implementing class
        System.out.println("Inside autowiring's @Autowired on Field Implementation:\n");

        payment.executePayment();
    }

    public IPayment1 getPayment() {
        return payment;
    }

 /*public void setPayment(IPayment payment) {
  this.payment = payment;
 }*/

}