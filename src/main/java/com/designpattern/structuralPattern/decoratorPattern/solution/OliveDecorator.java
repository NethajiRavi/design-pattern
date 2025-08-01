package com.designpattern.structuralPattern.decoratorPattern.solution;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza decoratorPizza) {
        super(decoratorPizza);
    }

    @Override
    public String getDescription() {
        return decoratorPizza.getDescription() + "olive";
    }

    @Override
    public double getCost() {
        return decoratorPizza.getCost() + 0.5;
    }

}
