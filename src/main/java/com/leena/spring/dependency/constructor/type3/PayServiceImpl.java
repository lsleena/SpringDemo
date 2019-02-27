package com.leena.spring.dependency.constructor.type3;

import com.leena.spring.dependency.constructor.type1.IPayService;

public class PayServiceImpl implements IPayService {

    private IPayment payment1;
    private IPayment payment2;

    PayServiceImpl(IPayment payment1, IPayment payment2) {

        this.payment1 = payment1;
        this.payment2 = payment2;
    }

    public void performPayment() {

        payment1.executePayment();
        payment2.executePayment();
    }
}