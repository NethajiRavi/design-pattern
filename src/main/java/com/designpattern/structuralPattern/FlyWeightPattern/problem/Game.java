package com.designpattern.structuralPattern.FlyWeightPattern.problem;

public class Game {


    public static void main(String[] args) {

        // 5 bullets

        for(int i =0;i<5;i++){
            Bullet bullet =  new Bullet("Red",i*10,i*20,120);
        }


        for(int i =0;i<5;i++){
            Bullet bullet =  new Bullet("Blue",i*10,i*20,120);
        }
    }


}
