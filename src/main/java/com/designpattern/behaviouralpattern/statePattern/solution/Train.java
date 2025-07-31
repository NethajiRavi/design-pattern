package com.designpattern.behaviouralpattern.statePattern.solution;

public class Train implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calculate ETA for Train 2");
        return 2;
    }

    @Override
    public String getDirection() {
        return "Train Direction";
    }
}
