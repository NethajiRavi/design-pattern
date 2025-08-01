package com.designpattern.structuralPattern.compositePattern.problem;

public class FileSystemApp {

    public static void main(String[] args) {



        File f1 =  new File("File1.txt");
        File f2 =  new File("File2.txt");

        Folder folder =  new Folder("Documnets");
        folder.addFile(f1);
        folder.addFile(f2);

        folder.showDetails();

    }
}
