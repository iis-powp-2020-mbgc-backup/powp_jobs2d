package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    List<DriverCommand> commandList;

    public ComplexCommand(){
        commandList = new ArrayList<>();
    }

    public void addCommand(DriverCommand command){
        commandList.add(command);
    }

    @Override
    public void execute(){
        for(DriverCommand command:commandList){
            command.execute();
        }
    }
}
