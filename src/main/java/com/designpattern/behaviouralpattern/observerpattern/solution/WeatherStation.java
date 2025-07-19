package com.designpattern.behaviouralpattern.observerpattern.solution;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation  implements  Subject{

    private  float temperature;

    private List<Observer> observersList; // can be multiple device



    public WeatherStation(){
        this.observersList = new ArrayList<>();
    }

    public void setTemperature(float temp){
        this.temperature = temp;
        notifyObservers();
    }


    @Override
    public void attach(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observersList.forEach(observer -> observer
                .update(temperature)); // run time poly
    }
}


