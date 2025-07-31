package com.designpattern.behaviouralpattern.iteratorpattern.solution;

import com.designpattern.behaviouralpattern.iteratorpattern.problem.Book;
import com.designpattern.behaviouralpattern.iteratorpattern.problem.BookCollection;

import java.util.Iterator;

public class WithIteratorPattern {

    public static void main(String[] args) {


        BookIter bookCollection =  new BookIter();
        bookCollection.addBook(new Book("Java"));
        bookCollection.addBook(new Book("python"));
        bookCollection.addBook(new Book("Java script"));
        Iterator<Book> books = bookCollection.iterator();

        while (books.hasNext()){
            System.out.println(books.next());
        }


    }

}
