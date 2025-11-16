package com.example.proiectsabloane2.commands;

import com.example.proiectsabloane2.books.Book;

public class UpdateBookCommand implements Command {

    private final CommandContext ctx;
    private final Integer id;
    private final Book book;

    public UpdateBookCommand(CommandContext ctx, Integer id, Book book) {
        this.ctx = ctx;
        this.id = id;
        this.book = book;
    }

    @Override
    public Object execute() {
        return ctx.getBooksService().update(id, book);
    }
}
