package com.example.proiectsabloane2;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {

    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        this.add(element);
    }

    @Override
    public void print() {
        System.out.println("Book: " + this.title);
        System.out.println();
        System.out.println("Authors:");
        for (Author a : authors) {
            a.print();
        }
        System.out.println();
        super.print();
    }
}