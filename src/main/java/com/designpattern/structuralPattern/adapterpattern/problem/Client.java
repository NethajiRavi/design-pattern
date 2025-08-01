package com.designpattern.structuralPattern.adapterpattern.problem;

public class Client {
    public static void main(String[] args) {



        NotificationService emailService = new EmailNotificationService();
        emailService.send("Nethaji","order Conformation","order has been received");
    }
}
