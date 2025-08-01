package com.designpattern.structuralPattern.proxypattern.problem;

public class RealImage implements Image{


    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }


    // expensive Operation
    private void loadImageFromDisk() {
        System.out.println("Loading Image from disk" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying Image " + fileName);
    }
}
