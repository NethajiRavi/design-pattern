package com.designpattern.behaviouralpattern.strategypattern.problem;

public class WithoutStrategyDesignPattern {


    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("Credit Card");

    }
}
