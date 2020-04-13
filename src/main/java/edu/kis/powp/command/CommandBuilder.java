package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class CommandBuilder {
    private List<DriverCommand> commands;

    public CommandBuilder() {
        this.commands = new ArrayList<>();
    }

    public CommandBuilder addCommand(DriverCommand command) {
        this.commands.add(command);
        return this;
    }

    public DriverCommand create() {
        return new ComplexCommand(this.commands);
    }
}
