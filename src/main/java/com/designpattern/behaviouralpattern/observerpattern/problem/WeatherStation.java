package com.designpattern.behaviouralpattern.observerpattern.problem;

public class WeatherStation {

    private  float temperature;

    private DisplayDevice displayDevice; // can be multiple device



    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temp){
        this.temperature = temp;
        notifyDevice();
    }


    public void notifyDevice(){
        displayDevice.showTemp(temperature);
    }
}


