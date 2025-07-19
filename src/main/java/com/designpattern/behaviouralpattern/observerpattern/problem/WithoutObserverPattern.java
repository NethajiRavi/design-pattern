package com.designpattern.behaviouralpattern.observerpattern.problem;

public class WithoutObserverPattern {


    public static void main(String[] args) {



        DisplayDevice displayDevice =  new DisplayDevice();
        WeatherStation weatherStation = new WeatherStation(displayDevice);


        // tight coupling between station and devices
        weatherStation.setTemperature(26);
        weatherStation.setTemperature(40);


    }
}
