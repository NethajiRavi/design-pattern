package com.designpattern.structuralPattern.decoratorPattern.problem;

public class CheesePizza extends BasicPizza {
    @Override
    public String getDescription() {
        return super.getDescription() + "Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }

}
