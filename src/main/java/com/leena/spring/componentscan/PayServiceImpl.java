package com.leena.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements IPayService {

    @Autowired
    private IPayment payment;

    public IPayment getPayment() {
        return payment;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    @Override
    public void performPayment() {

        System.out.println("Inside perform patyment.\n");
        payment.executePayment();
    }
}
