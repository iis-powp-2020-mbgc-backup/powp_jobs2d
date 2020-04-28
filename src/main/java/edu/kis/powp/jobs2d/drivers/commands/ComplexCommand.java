package edu.kis.powp.jobs2d.drivers.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    protected List<DriverCommand> commands = new ArrayList<>();

    @Override
    public void execute(Job2dDriver target) {
        for(DriverCommand command : commands) {
            command.execute(target);
        }
    }

    public void addComannd(DriverCommand command) {
        commands.add(command);
    }
}
