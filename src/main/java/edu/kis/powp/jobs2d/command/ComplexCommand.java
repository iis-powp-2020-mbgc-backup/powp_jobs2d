package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commandList = new ArrayList<>();

    public ComplexCommand(ArrayList<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public ComplexCommand() {
    }

    public void addCommand(DriverCommand command) {
        commandList.add(command);
    }

    public List<DriverCommand> getCommandList() {
        return commandList;
    }

    public void setCommandList(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute() {
        for (DriverCommand command : commandList) {
            command.execute();
        }
    }
}
