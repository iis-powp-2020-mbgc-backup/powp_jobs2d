package edu.kis.powp.command;

import java.util.ArrayList;


public class ComplexCommand implements DriverCommand {
    ArrayList<DriverCommand> driverCommandList;

    public ComplexCommand(ArrayList<DriverCommand> driverCommandList) {
        this.driverCommandList = driverCommandList;
    }

    @Override
    public void execute() {
        driverCommandList.forEach(DriverCommand::execute);
    }
}
