package com.designpattern.behaviouralpattern.templatepattern.solution;

abstract class DataParser {


    // Template to define the algorithm
    public final void parse(){

        openFiles();
        parseData();
        closeFile();

    }
    protected abstract void parseData();

    protected void closeFile() {
        System.out.println("Closing File");
    }


    protected void openFiles() {
        System.out.println("Opening File");
    }
}
