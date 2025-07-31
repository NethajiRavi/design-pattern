package com.designpattern.behaviouralpattern.statePattern.solution;

public class Walking implements TransportationMode {
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA for Walking 10");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Direction For Walking";
    }
}
