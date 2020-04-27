package edu.kis.powp.jobs2d.drivers.Command;

import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> commandList = new LinkedList<>();

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
