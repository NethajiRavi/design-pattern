package com.designpattern.structuralPattern.compositePattern.solution;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{


    private String folderName;

    private List<FileSystemComponent> fileList =  new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void addFile(FileSystemComponent fileSystemComponent){
        this.fileList.add(fileSystemComponent);
    }

    @Override
    public void showDetails() {
        for(FileSystemComponent file : fileList){
            file.showDetails();
        }
    }
}
