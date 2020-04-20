package edu.kis.powp.command;

import java.util.ArrayList;

public class CommandBuilder {
    private ArrayList<DriverCommand> commands;

    public CommandBuilder() {
        commands = new ArrayList<>();
    }

    public void add(DriverCommand command) {
        commands.add(command);
    }

    public void remove(int index) {
        commands.remove(index);
    }

    public DriverCommand build() {
        return new ComplexCommand(commands);
    }
}
