package com.designpattern.structuralPattern.adapterpattern.solution;

public class SendGridService {


    public void sendEmila(String receipient,String title,String content){
        System.out.println("sending email via send grid" + receipient);
    }
}
