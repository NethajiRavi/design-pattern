package com.designpattern.structuralPattern.adapterpattern.solution;

import com.designpattern.structuralPattern.adapterpattern.problem.NotificationService;

public class sendGridAdapter implements NotificationService {

    private SendGridService sendGridService;

    public sendGridAdapter(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body) {
        // Adapter method -> cover the parameter and calls to sendGrid method
        sendGridService.sendEmila(to,subject,body);
    }
}
