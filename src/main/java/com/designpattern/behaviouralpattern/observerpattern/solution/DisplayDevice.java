package com.designpattern.behaviouralpattern.observerpattern.solution;

public class DisplayDevice implements Observer {



    @Override
    public void update(float temp) {
        System.out.println("Temp display in DisplayDevice:" + temp  + "c");
    }
}
