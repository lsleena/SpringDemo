package com.leena.spring.autoWiring.usingAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class PayServiceImplForContructor implements IPayService1{

    private IPayment1 payment;
    // Constructor
    @Autowired
    PayServiceImplForContructor(IPayment1 payment){
        this.payment = payment;
    }

    public void performPayment() {
        // calling method on Ipayment implementing class
        System.out.println("Inside autowiring's @Autowired on Contructor Implementation:\n");

        payment.executePayment();
    }

    public IPayment1 getPayment() {
        return payment;
    }

 /*public void setPayment(IPayment payment) {
  this.payment = payment;
 }*/
}
