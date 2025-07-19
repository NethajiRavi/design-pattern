package com.designpattern.behaviouralpattern.observerpattern.solution;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();


}
