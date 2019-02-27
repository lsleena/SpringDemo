package com.leena.spring.dependency.constructor.type2;

import com.leena.spring.dependency.constructor.type1.IPayService;

public class PayServiceImpl implements IPayService {

    private CashPayment payment1;
    private CreditPayment payment2;
    private int amount;

    PayServiceImpl(CashPayment payment1, CreditPayment payment2) {

        this.payment1 = payment1;
        this.payment2 = payment2;
    }

    public void performPayment() {

        payment1.executePayment();
        payment2.executePayment();
    }
}