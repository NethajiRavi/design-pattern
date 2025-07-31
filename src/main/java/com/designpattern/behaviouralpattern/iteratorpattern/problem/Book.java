package com.designpattern.behaviouralpattern.iteratorpattern.problem;

import java.util.Iterator;

public class Book {

    public String book;

    public Book(String book) {
        this.book = book;
    }

    private class BookIterator implements Iterator{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
