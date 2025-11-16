package com.example.proiectsabloane2.commands;

public class GetAllBooksCommand implements Command {

    private final CommandContext ctx;

    public GetAllBooksCommand(CommandContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public Object execute() {
        return ctx.getBooksService().getAll();
    }
}
