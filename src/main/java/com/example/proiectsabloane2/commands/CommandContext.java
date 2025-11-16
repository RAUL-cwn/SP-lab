package com.example.proiectsabloane2.commands;

import com.example.proiectsabloane2.books.BooksService;

public class CommandContext {

    private final BooksService booksService;

    public CommandContext(BooksService booksService) {
        this.booksService = booksService;
    }

    public BooksService getBooksService() {
        return booksService;
    }
}
