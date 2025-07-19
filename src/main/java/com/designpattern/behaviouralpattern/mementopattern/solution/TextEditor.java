package com.designpattern.behaviouralpattern.mementopattern.solution;

public class TextEditor {

    private String content;


    public void write(String text){
        this.content = text;
    }


    public String getContent() {
        return content;
    }


    // save the state
    public EditorMemento save(){
        return new EditorMemento(content);
    }

    // Restore ( Memento -> update)
    public void restore(EditorMemento editorMemento){
        this.content = editorMemento.getContent();
    }
}
