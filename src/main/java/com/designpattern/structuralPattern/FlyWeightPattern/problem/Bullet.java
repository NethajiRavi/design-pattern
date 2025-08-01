package com.designpattern.structuralPattern.FlyWeightPattern.problem;

public class Bullet {

    private  String color;

    private  int x,y;

    private int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
    }



    public void display(){

        System.out.println("Bullet is Moving at direction" + x + y + "at velocity" + velocity );
    }
}
