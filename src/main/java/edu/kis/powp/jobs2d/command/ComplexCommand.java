package edu.kis.powp.jobs2d.command;


import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> driverCommandList;

    public ComplexCommand(ArrayList<DriverCommand> driverCommandList) {
        this.driverCommandList = driverCommandList;
    }

    @Override
    public void execute() {
        for (DriverCommand driverCommand : driverCommandList) {
            driverCommand.execute();
        }
    }
}
