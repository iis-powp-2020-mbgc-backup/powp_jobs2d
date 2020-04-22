package edu.kis.powp.jobs2d.drivers.command;

import java.util.LinkedList;

public class ComplexCommandBuilder {
    final private LinkedList<DriverCommand> commands;

    public ComplexCommandBuilder() {
        commands = new LinkedList<>();
    }

    public void addCommand(DriverCommand command) {
        commands.add(command);
    }

    public void removeCommand(int index) {
        commands.remove(index);
    }

    public DriverCommand build() {
        return new ComplexCommand(commands);
    }
}