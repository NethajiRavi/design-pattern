package com.designpattern.behaviouralpattern.observerpattern.solution;

public class ObserverPattern {


    public static void main(String[] args) {
        WeatherStation weatherStation =  new WeatherStation();

        DisplayDevice displayDevice =  new DisplayDevice();
        weatherStation.attach(displayDevice);
        weatherStation.setTemperature(12);


        MobileDevice mobileDevice =  new MobileDevice();
        weatherStation.attach(mobileDevice);
        weatherStation.setTemperature(66);

    }


}
