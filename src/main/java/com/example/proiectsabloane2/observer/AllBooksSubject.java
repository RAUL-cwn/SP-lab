package com.example.proiectsabloane2.observer;

import com.example.proiectsabloane2.books.Book;
import java.util.ArrayList;
import java.util.List;

public class AllBooksSubject implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void add(Book book) {
        notifyAllObservers(book);
    }

    private void notifyAllObservers(Book book) {
        for (Observer o : observers) {
            o.update(book);
        }
    }
}
