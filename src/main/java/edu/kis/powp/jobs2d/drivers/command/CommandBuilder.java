package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class CommandBuilder{
    List<DriverCommand> commands;

    public CommandBuilder() {
        commands = new ArrayList<>();
    }
    public void addCommand(DriverCommand command){
        commands.add(command);
    }

    public DriverCommand getComplexCommand(){
        return new ComplexCommand(commands);
    }
}
