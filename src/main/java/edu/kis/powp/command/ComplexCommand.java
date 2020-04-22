package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> commandList;

    public ComplexCommand(DriverCommand... commands) {
        this(Arrays.asList(commands));
    }

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand command: commandList) {
            command.execute(job2dDriver);
        }
    }
}