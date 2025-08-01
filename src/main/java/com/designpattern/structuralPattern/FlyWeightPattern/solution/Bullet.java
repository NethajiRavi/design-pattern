package com.designpattern.structuralPattern.FlyWeightPattern.solution;

public class Bullet {

    private BulletType bulletType;

    private  int x,y;

    private int velocity;

    public Bullet(String color,int x, int y, int velocity) {
        bulletType = BulletTypeFactory.getBulletType(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
    }



    public void display(){

        System.out.println("Bullet is Moving at direction" + x + y + "at velocity" + velocity );
    }
}
