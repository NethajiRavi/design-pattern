package com.designpattern.behaviouralpattern.templatepattern.problem;

public class JsonParser {

    public  void  parse(){

        openingFile();
        System.out.println("Json Parser");
        closingFile();
    }

    private void closingFile() {
        System.out.println("Closing Json File");
    }

    private void openingFile() {
        System.out.println("Opening Json File");
    }
}
