package com.designpattern.behaviouralpattern.mediatorpattern.problem;

public class WithoutMediatorPattern {


    public static void main(String[] args) {



        User rahul =  new User("rahul");
        User amit =  new User("amit");
        User neha =  new User("neha");

        rahul.sendMessage("Hello",amit);
        rahul.sendMessage("Hello",neha);







    }
}
