package com.designpattern.structuralPattern.Facadepattern.problem;

public class PaymentService {

    public String getOrderDetails(String paymentId){
        return "Process payment for paymentId"+ paymentId;
    }
}
