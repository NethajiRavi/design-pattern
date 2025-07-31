package com.designpattern.behaviouralpattern.templatepattern.problem;

public class WithoutTemplatePattern {
    public static void main(String[] args) {



        CsvParser csvParser =  new CsvParser();
        csvParser.parse();

        // code duplication
        JsonParser jsonParser =  new JsonParser();
        jsonParser.parse();



    }
}
