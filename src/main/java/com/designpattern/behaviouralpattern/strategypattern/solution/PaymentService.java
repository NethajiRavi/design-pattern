package com.designpattern.behaviouralpattern.strategypattern.solution;

public class PaymentService {

    private  PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public  void  pay(){
        paymentStrategy.processPayment();
    }

}