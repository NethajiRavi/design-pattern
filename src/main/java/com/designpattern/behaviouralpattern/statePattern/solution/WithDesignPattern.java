package com.designpattern.behaviouralpattern.statePattern.solution;

public class WithDesignPattern {
    public static void main(String[] args) {

        Direction direction =  new Direction( new Cycling());

       // direction.setTransportationMode(new Train());

        direction.getDirection();
        direction.getETA();

    }
}
