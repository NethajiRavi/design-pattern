package com.designpattern.behaviouralpattern.mementopattern.solution;

import java.util.Stack;

//  Managing the mementos (snap chat of text editor)
public class CareTaker {

    private final Stack<EditorMemento> editorMementoStack =  new Stack<>();

    public  void  saveState(TextEditor textEditor){
        editorMementoStack.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if(!editorMementoStack.isEmpty()){
            editorMementoStack.pop();
            textEditor.restore(editorMementoStack.peek());
        }
    }
}