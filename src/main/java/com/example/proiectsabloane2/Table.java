package com.example.proiectsabloane2;

public class Table implements Element {

    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Table with title: " + title);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Cannot add to a Table");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Cannot remove from a Table");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Table has no children");
    }
}
