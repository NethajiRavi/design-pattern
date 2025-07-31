package com.designpattern.behaviouralpattern.templatepattern.solution;


public class WithTemplate {


    public static void main(String[] args) {


        DataParser csvParser =  new CsvParser();
        csvParser.parse();

        DataParser jsonParser = new JsonParser();
        jsonParser.parse();


    }
}
