package com.designpattern.structuralPattern.compositePattern.problem;

import java.util.ArrayList;
import java.util.List;

public class Folder {


    private String Name;

    private List<File> files = new ArrayList<>();

    public Folder(String name) {
        Name = name;
    }


    public void addFile(File file) {
        this.files.add(file);
    }


    public void showDetails() {
        System.out.println("Folder:" + Name);

        for (File file : files) {
            file.showDetails();
        }
    }


}
