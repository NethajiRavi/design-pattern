package com.designpattern.structuralPattern.adapterpattern.solution;

import com.designpattern.structuralPattern.adapterpattern.problem.NotificationService;

public class Client {


    public static void main(String[] args) {

        NotificationService sendGridService =  new sendGridAdapter(new SendGridService());
        sendGridService.send("asd","hi","Nothing");


    }
}
