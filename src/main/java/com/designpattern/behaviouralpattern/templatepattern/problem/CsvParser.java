package com.designpattern.behaviouralpattern.templatepattern.problem;

public class CsvParser {


    public  void  parse(){

        openingFile();
        System.out.println("Csv Parser");
        closingFile();
    }

    private void closingFile() {
        System.out.println("Closing Csv File");
    }

    private void openingFile() {
        System.out.println("Opening Csv File");
    }
}
