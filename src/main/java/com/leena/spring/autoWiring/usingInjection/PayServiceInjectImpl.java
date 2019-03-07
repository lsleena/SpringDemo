package com.leena.spring.autoWiring.usingInjection;

import com.leena.spring.autoWiring.usingAutowired.IPayService1;
import com.leena.spring.autoWiring.usingAutowired.IPayment1;

import javax.inject.Inject;
import javax.inject.Named;

// @Inject annotation for Setter method too

public class PayServiceInjectImpl implements IPayService1{

        @Inject
        @Named("cashPaymentBean")
        private IPayment1 payment;

        public void performPayment() {

            System.out.println("Inside PayServiceInjectImpl : \n");
            // calling method on Ipayment implementing class
            payment.executePayment();
        }

        public IPayment1 getPayment() {
            return payment;
        }

        @Inject
        public void setPayment(@Named("cashPaymentBean")IPayment1 payment) {
            this.payment = payment;
        }
}
