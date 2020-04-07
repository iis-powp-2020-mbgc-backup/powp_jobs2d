package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> commands;

    public  ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(DriverCommand::execute);
    }
}
