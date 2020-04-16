package edu.kis.powp.jobs2d.drivers.command;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> driverCommandList;

    public ComplexCommand(List<DriverCommand> driverCommandList) {
        this.driverCommandList = driverCommandList;
    }

    @Override
    public void execute() {
        for (DriverCommand driverCommand : driverCommandList) {
            driverCommand.execute();
        }
    }
}
