package com.designpattern.structuralPattern.decoratorPattern.solution;

abstract class PizzaDecorator implements Pizza {


    protected Pizza decoratorPizza;

    public PizzaDecorator(Pizza decoratorPizza) {
        this.decoratorPizza = decoratorPizza;
    }

    @Override
    public String getDescription() {
        return decoratorPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratorPizza.getCost();
    }
}
