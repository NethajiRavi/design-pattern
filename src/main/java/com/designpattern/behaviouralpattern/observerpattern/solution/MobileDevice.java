package com.designpattern.behaviouralpattern.observerpattern.solution;

public class MobileDevice implements Observer {
    @Override
    public void update(float temp) {

        System.out.println("Temp display in Mobile:" + temp  + "c");
    }
}
