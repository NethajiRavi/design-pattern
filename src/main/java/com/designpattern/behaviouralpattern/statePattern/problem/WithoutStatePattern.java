package com.designpattern.behaviouralpattern.statePattern.problem;

public class WithoutStatePattern {
    public static void main(String[] args) {

        DirectionService directionService = new DirectionService(TransportationMode.WALKING);


        directionService.setTransportationMode(TransportationMode.CAR);
        directionService.getETA();
        System.out.println(directionService.getDirection());

    }
}
