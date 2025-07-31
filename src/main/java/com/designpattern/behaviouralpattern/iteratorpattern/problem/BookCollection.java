package com.designpattern.behaviouralpattern.iteratorpattern.problem;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    List<Book> bookList =  new ArrayList<>();

    public void  addBook(Book book){
        this.bookList.add(book);
    }

    public List<Book> getBooks(){
        return this.bookList;
    }

    @Override
    public String toString() {
        return "BookCollection{" +
                "bookList=" + bookList +
                '}';
    }
}
