package com.designpattern.structuralPattern.compositePattern.solution;

public class FileSyatemApp {

    public static void main(String[] args) {



        FileSystemComponent fileSystemComponent =  new File("File1.txt");
        FileSystemComponent fileSystemComponent1 =  new File("file2.txt");
        Folder  folder =  new Folder("Doc1");
        folder.addFile(fileSystemComponent);
        folder.addFile(fileSystemComponent1);



        // sub Folder

        Folder subFolder =  new Folder("subFolder");
        FileSystemComponent files2 = new File("Files.txt2");
        subFolder.addFile(files2);


        folder.addFile(subFolder);


    }
}
