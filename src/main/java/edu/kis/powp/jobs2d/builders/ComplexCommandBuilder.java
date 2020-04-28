package edu.kis.powp.jobs2d.builders;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandBuilder implements CommandBuilder{

    private List<DriverCommand> commands;

    public ComplexCommandBuilder(){
        commands = new ArrayList<>();
    }

    public void addCommand(DriverCommand command){
        commands.add(command);
    }

    @Override
    public ComplexCommand build(){
        return new ComplexCommand(commands);
    }


}
