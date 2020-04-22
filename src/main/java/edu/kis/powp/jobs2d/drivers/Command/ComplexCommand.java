package edu.kis.powp.jobs2d.drivers.Command;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> commandList;

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public void addCommand(DriverCommand command){
        commandList.add(command);
    }

    @Override
    public void execute() {
        for (DriverCommand command: commandList) {
            command.execute();
        }
    }
}
