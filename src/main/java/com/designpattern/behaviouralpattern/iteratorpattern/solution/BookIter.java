package com.designpattern.behaviouralpattern.iteratorpattern.solution;

import com.designpattern.behaviouralpattern.iteratorpattern.problem.Book;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookIter implements  Iterable<Book>{



    private Set<Book> bookSt =  new TreeSet<>();

    public void addBook(Book book) {
        bookSt.add(book);
    }


    @Override
    public Iterator<Book> iterator() {
        return bookSt.iterator();
    }
}
