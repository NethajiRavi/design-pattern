package com.designpattern.behaviouralpattern.statePattern.problem;

public class DirectionService {

    private  TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }


    public void setTransportationMode(TransportationMode transportationMode){
        this.transportationMode =transportationMode;
    }

   // calculateETA

    public int getETA(){
        switch (transportationMode){

            case WALKING -> {
                System.out.println("WALKING");
                return 10;
            }
            case CYCLING -> {
                System.out.println("CYCLING");
                return 5;
            }
            case CAR -> {
                System.out.println("CAR");
                return 3;
            }
            case TRAIN -> {
                System.out.println("Train");
                return 2;
            }default -> throw new IllegalStateException("Unknown mode");
        }
    }

    public String getDirection(){
        switch (transportationMode){

            case WALKING -> {
                return "Direction For Walking : head north 100 meter";
            }
            case CYCLING ->{
            return "Direction For Cycling : head north 1000 meter";
            }
            case CAR -> {
                return "Direction For CAR : head north 100 meter";
            }
            case TRAIN -> {
                return "Direction For Train : head north 10000 meter";
            }default -> throw new IllegalStateException("Unknown mode");
        }
    }




}
