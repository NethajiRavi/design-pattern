package com.designpattern.behaviouralpattern.statePattern.solution;

public class Cycling implements TransportationMode{


    @Override
    public int calcETA() {
        System.out.println("Calculating ETA for Cycling 5");
        return 5;
    }

    @Override
    public String getDirection() {
        return "Cycling Direction";
    }
}
