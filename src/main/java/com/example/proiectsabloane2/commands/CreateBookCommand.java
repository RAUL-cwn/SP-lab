package com.example.proiectsabloane2.commands;

import com.example.proiectsabloane2.books.Book;

public class CreateBookCommand implements Command {

    private final CommandContext ctx;
    private final Book book;

    public CreateBookCommand(CommandContext ctx, Book book) {
        this.ctx = ctx;
        this.book = book;
    }

    @Override
    public Object execute() {
        return ctx.getBooksService().create(book);
    }
}
