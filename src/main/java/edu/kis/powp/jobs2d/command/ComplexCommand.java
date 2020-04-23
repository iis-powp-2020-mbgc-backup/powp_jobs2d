package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    List<DriverCommand> commandList = new ArrayList<>();

    public ComplexCommand(ArrayList<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public ComplexCommand() {
    }

    @Override
    public void execute() {
        for (DriverCommand command : commandList) {
            command.execute();
        }
    }

    public void addCommand(DriverCommand command) {
        commandList.add(command);
    }
}
