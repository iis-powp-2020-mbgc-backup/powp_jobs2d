package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands;

    public ComplexCommand(DriverCommand... commands) {
        this.commands = new ArrayList<>();
        this.commands.addAll(Arrays.asList(commands));
    }

    public ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        this.commands.forEach(DriverCommand::execute);
    }
}
