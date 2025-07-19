package com.designpattern.behaviouralpattern.mementopattern.solution;

public class TextEditorMain {


    public static void main(String[] args) {

        /*
         * To print the previous state of the object
        */
        TextEditor textEditor =  new TextEditor();
        CareTaker careTaker =  new CareTaker();

        textEditor.write("Hello");
        careTaker.saveState(textEditor);

        textEditor.write("world");
        careTaker.saveState(textEditor);


        careTaker.undo(textEditor);
        System.out.println(textEditor.getContent());


    }
}
