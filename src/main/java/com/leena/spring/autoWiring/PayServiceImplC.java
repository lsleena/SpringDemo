package com.leena.spring.autoWiring;

public class PayServiceImplC implements IPayService {

    private IPayment payment;
    private int amount;

    // Constructor
    PayServiceImplC(IPayment payment){
        this.payment = payment;
    }

    public void performPayment() {
        // calling payment class executePayment method
        payment.executePayment(amount);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}