package com.leena.spring.autoWiring.excludeBean;

public class DollarPayment implements IMoneyPayment  {

    public void executePayment() {

        System.out.println("Perform Dollar Payment ");
    }
}
