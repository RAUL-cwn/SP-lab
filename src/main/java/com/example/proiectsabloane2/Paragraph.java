package com.example.proiectsabloane2;

public class Paragraph implements Element {

    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print() {
        if (alignStrategy == null) {
            System.out.println("Paragraph: " + text);
        } else {
            alignStrategy.render(this);
        }
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Cannot add to a Paragraph");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Cannot remove from a Paragraph");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Paragraph has no children");
    }
}