package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commandList;

    public ComplexCommand(DriverCommand... commands) {
        this(Arrays.asList(commands));
    }

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = new ArrayList<>(commandList);
    }

    @Override
    public void execute() {
        for (DriverCommand command : commandList) {
            command.execute();
        }
    }
}