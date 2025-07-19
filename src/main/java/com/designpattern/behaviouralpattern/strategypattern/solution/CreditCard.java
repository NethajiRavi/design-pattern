package com.designpattern.behaviouralpattern.strategypattern.solution;

public class CreditCard implements  PaymentStrategy{


    @Override
    public void processPayment() {
        System.out.println("Making Payment Via CreditCard");

    }
}
