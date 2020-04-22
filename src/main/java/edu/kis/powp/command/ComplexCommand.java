package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> commandList;

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commandList = commands;
    }

    @Override
    public void execute() {
        for(int i=0;i<commandList.size();i++) {
            commandList.get(i).execute();
        }
    }
}
