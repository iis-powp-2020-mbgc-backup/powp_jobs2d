package edu.kis.powp.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    ArrayList<DriverCommand> commandList;

    public ComplexCommand(ArrayList<DriverCommand> arrayList) {
        this.commandList = arrayList;
    }

    @Override
    public void execute() {
        for(int i=0;i<commandList.size();i++) {
            commandList.get(i).execute();
        }
    }
}
