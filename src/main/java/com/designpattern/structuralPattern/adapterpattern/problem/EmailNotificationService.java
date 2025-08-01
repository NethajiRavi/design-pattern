package com.designpattern.structuralPattern.adapterpattern.problem;


// legacy code
public class EmailNotificationService implements NotificationService {

    @Override
    public void  send(String to ,String subject,String body){
        System.out.println("Sending Email to" + to);
        System.out.println("Subject" + subject);
        System.out.println("Bodt" + body);
    }


}
