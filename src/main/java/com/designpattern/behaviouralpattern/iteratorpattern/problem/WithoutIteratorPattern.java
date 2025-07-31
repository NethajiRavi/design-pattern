package com.designpattern.behaviouralpattern.iteratorpattern.problem;

public class WithoutIteratorPattern {

    public static void main(String[] args) {


        // it will break if we change the array list into Tree set or map
        BookCollection bookCollection =  new BookCollection();
        bookCollection.addBook(new Book("Java"));
        bookCollection.addBook(new Book("python"));
        bookCollection.addBook(new Book("Java script"));


        for(int i =0 ;i<= bookCollection.getBooks().size()-1;i++){
            System.out.println(bookCollection.getBooks().get(i));
        }


    }
}
