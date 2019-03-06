package com.leena.spring.componentscan;

import org.springframework.stereotype.Component;

@Component
public class CashPayment implements IPayment {
    @Override
    public void executePayment() {

        System.out.println("Inside execute patyment.\n");
        System.out.println("Perform Cash Payment - ");

    }
}
