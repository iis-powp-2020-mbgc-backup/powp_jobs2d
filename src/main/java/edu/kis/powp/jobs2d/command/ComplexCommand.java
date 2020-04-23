package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commands;

    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }


    public void addCommand(DriverCommand command) {
        this.commands.add(command);
    }

    public void removeCommand(DriverCommand command)
    {
        this.commands.remove(command);
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands)
            command.execute();
    }
}