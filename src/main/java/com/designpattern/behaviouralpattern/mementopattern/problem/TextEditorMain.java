package com.designpattern.behaviouralpattern.mementopattern.problem;

public class TextEditorMain {


    public static void main(String[] args) {

        /*
         * To print the previous state of the object
        */
        TextEditor textEditor =  new TextEditor();


        textEditor.write("Hello");
        textEditor.write("world");

        System.out.println(textEditor.getContent());


    }
}
