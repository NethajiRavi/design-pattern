package com.designpattern.behaviouralpattern.strategypattern.solution;

public class DebitCard  implements  PaymentStrategy {


    @Override
    public void processPayment() {
        System.out.println("Making Payment Via DebitCard");
    }
}
