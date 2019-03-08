package com.leena.spring.autoWiring.excludeBean;

import org.springframework.beans.factory.annotation.Autowired;

public class MoneyPayServiceImpl implements IMoneyPayservice {

    @Autowired
    private IMoneyPayment payment;

    public void setPayment(IMoneyPayment payment) {

        this.payment = payment;
    }

    public void performPayment() {

        System.out.println("performPayment in Exclude Bean code");
        payment.executePayment();
    }
}
