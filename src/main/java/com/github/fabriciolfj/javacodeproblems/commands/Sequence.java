package com.github.fabriciolfj.javacodeproblems.commands;

import java.util.List;
import java.util.ArrayList;

public class Sequence {

    private final List<Command> commands = new ArrayList<>();

    public void recordSequence(Command cmd) {
        commands.add(cmd);
    }

    public void runSequence() {
        commands.forEach(Command::execute);
    }

    public void clearSequence() {
        commands.clear();
    }
}
