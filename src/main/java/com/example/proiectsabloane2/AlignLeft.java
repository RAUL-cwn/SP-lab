package com.example.proiectsabloane2;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph (Left): " + paragraph.getText());
    }
}