package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> drivers;

    public ComplexCommand(List<DriverCommand> drivers){
        this.drivers = drivers;
    }

    @Override
    public void execute() {
        drivers.forEach(DriverCommand::execute);
    }
}
