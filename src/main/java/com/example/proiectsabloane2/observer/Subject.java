package com.example.proiectsabloane2.observer;

import com.example.proiectsabloane2.books.Book;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void add(Book book);
}
