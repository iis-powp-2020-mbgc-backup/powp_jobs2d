package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class FactoryCommand {
    public static DriverCommand square(Job2dDriver job2dDriver, int length) {
        List<DriverCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new SetPositionCommand(job2dDriver, 0, 0));
        listOfCommands.add(new OperateToCommand(job2dDriver, 0, length));
        listOfCommands.add(new OperateToCommand(job2dDriver, length, length));
        listOfCommands.add(new OperateToCommand(job2dDriver, length, 0));
        listOfCommands.add(new OperateToCommand(job2dDriver, 0, 0));

        ComplexCommand cc = new ComplexCommand(listOfCommands);
        return cc;
    }
}
