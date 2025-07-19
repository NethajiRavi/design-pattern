package com.designpattern.behaviouralpattern.strategypattern.solution;

public class StrategyMain {

    public static void main(String[] args) {
        PaymentService paymentService =  new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.pay();


        PaymentService paymentService1 =  new PaymentService();
        paymentService.setPaymentStrategy(new DebitCard() );
        paymentService.pay();






    }
}
