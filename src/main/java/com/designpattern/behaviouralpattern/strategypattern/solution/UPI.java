package com.designpattern.behaviouralpattern.strategypattern.solution;

public class UPI implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Making Payment Via UPI");
    }
}
