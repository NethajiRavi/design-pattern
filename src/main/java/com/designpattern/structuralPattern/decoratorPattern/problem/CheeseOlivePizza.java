package com.designpattern.structuralPattern.decoratorPattern.problem;

public class CheeseOlivePizza extends CheesePizza{

    @Override
    public String getDescription() {
        return super.getDescription() + "olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

}
