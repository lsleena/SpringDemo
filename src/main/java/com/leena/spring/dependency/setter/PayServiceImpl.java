package com.leena.spring.dependency.setter;

import com.leena.spring.dependency.constructor.type1.IPayService;
import com.leena.spring.dependency.constructor.type1.IPayment;

public class PayServiceImpl implements IPayService {

    private IPayment payment;
    private int amount;

    public void performPayment() {

        payment.executePayment(amount);
    }

    public IPayment getPayment() {

        return payment;
    }
    public void setPayment(IPayment payment) {

        this.payment = payment;
    }

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }
}