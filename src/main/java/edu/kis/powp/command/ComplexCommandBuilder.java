package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandBuilder{

    private List<DriverCommand> commands;

    public ComplexCommandBuilder(){
        commands = new ArrayList<>();
    }

    public void addCommand(DriverCommand command){
        commands.add(command);
    }


    public ComplexCommand build(){
        return new ComplexCommand(commands);
    }


}
