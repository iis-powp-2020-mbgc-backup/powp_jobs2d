package edu.kis.powp.jobs2d.command;


import java.util.ArrayList;

public class Command implements DriverCommand {

    private ArrayList<DriverCommand> driverCommandList;
    public Command(ArrayList<DriverCommand> driverCommandList) {
        this.driverCommandList = driverCommandList;
    }

    @Override
    public void execute() {

        for (int i = 0; i < driverCommandList.size(); i++) {
            driverCommandList.get(i).execute();
        }
    }
}