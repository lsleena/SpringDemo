package com.leena.spring.javaconfig;

public class PayServiceImpl implements IPayService {

    public IPayment getPayment() {
        return payment;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    private IPayment payment;

    @Override
    public void performPayment() {

        payment.executePayment();
    }
}
