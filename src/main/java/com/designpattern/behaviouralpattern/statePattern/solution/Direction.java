package com.designpattern.behaviouralpattern.statePattern.solution;

public class Direction {

   private  TransportationMode transportationMode;


    public Direction(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }


    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public int getETA(){
        return transportationMode.calcETA();
    }


    public String getDirection(){
        return transportationMode.getDirection();
    }

}
