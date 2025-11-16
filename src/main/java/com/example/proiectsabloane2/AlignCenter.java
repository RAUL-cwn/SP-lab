package com.example.proiectsabloane2;

public class AlignCenter implements AlignStrategy {

    private static final int LINE_WIDTH = 40;

    @Override
    public void render(Paragraph paragraph) {
        String text = paragraph.getText();
        int spaces = Math.max(0, (LINE_WIDTH - text.length()) / 2);
        String padding = " ".repeat(spaces);
        System.out.println(padding + "Paragraph (Center): " + text);
    }
}