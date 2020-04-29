package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> drivers = new ArrayList<>();

    public ComplexCommand() {

    }

    void addCommand(DriverCommand command) {
        this.drivers.add(command);
    }

    @Override
    public void execute() {
        drivers.forEach(DriverCommand::execute);
    }
}
