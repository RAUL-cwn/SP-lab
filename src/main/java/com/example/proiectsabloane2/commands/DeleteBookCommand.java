package com.example.proiectsabloane2.commands;

public class DeleteBookCommand implements Command {

    private final CommandContext ctx;
    private final Integer id;

    public DeleteBookCommand(CommandContext ctx, Integer id) {
        this.ctx = ctx;
        this.id = id;
    }

    @Override
    public Object execute() {
        ctx.getBooksService().delete(id);
        return null;
    }
}
