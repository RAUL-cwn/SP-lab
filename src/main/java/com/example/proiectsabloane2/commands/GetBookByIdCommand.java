package com.example.proiectsabloane2.commands;

public class GetBookByIdCommand implements Command {

    private final CommandContext ctx;
    private final Integer id;

    public GetBookByIdCommand(CommandContext ctx, Integer id) {
        this.ctx = ctx;
        this.id = id;
    }

    @Override
    public Object execute() {
        return ctx.getBooksService().getById(id);
    }
}
