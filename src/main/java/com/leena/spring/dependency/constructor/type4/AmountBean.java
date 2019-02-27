package com.leena.spring.dependency.constructor.type4;

public class AmountBean {

    private int amount;
    private String year;

    public AmountBean(int amount, String year) {

        this.amount = amount;
        this.year = year;
    }

    public void displayValue() {

        System.out.println("Amount is - " + amount);
        System.out.println("Year is - " + year);
    }
}