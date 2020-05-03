package edu.kis.powp.jobs2d.command;

import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> list;

    public ComplexCommand() {
        this.list = new LinkedList<>();
    }

    public ComplexCommand(List<DriverCommand> list) {
        this.list = list;
    }

    public void addCommand(DriverCommand driverCommand) {
        this.list.add(driverCommand);
    }

    @Override
    public void execute() {
        list.forEach(DriverCommand::execute);
    }
}
