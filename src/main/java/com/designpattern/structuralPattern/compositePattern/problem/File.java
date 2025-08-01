package com.designpattern.structuralPattern.compositePattern.problem;

public class File {


   private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }


    public  void  showDetails(){
        System.out.println("File" +  fileName);
    }
}
