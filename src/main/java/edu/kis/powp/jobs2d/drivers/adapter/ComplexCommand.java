package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> commandList = new LinkedList<>();

    public void addCommand(DriverCommand command) {
        commandList.add(command);
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for (DriverCommand command : commandList) {
            command.execute(job2dDriver);
        }
    }
}
