package com.example.proiectsabloane2.commands;

import org.springframework.stereotype.Component;

@Component
public class SyncCommandExecutor implements CommandExecutor {

    @Override
    public Object execute(Command command) {
        return command.execute();
    }
}
