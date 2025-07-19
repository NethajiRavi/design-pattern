package com.designpattern.behaviouralpattern.strategypattern.problem;

public class PaymentService {


    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("Credit Card")){
            System.out.println("Making Payment via Credit Card");
        } else if (paymentMethod.equals("Debit Card")) {
            System.out.println("Making Payment via Debit Card");
        }else {
            System.out.println("Unsupported Payment");
        }
    }
}
