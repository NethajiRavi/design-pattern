package com.designpattern.structuralPattern.decoratorPattern.solution;

public class CheeseDecorator extends  PizzaDecorator{

    public CheeseDecorator(Pizza decoratorPizza) {
        super(decoratorPizza);
    }

    @Override
    public String getDescription() {
        return decoratorPizza.getDescription() + "Cheese";
    }

    @Override
    public double getCost() {
        return decoratorPizza.getCost() + 1.00;
    }

}
