package com.designpattern.structuralPattern.proxypattern.solution;

import com.designpattern.structuralPattern.proxypattern.problem.Image;

public class ProxyMain {

    public static void main(String[] args) {


        Image image =  new ProxyImage("Dog.png");
        Image image2 =  new ProxyImage("cat.png");

        image.display(); // create Real Image + load + Lazy load + caching
        image.display();
    }
}
