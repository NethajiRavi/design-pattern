package com.designpattern.structuralPattern.FlyWeightPattern.solution;

public class BulletType {

    private  String color;

    public BulletType(String color) {
        this.color = color;
        System.out.println("Creating BUllet Type With"+ color);
    }
}
