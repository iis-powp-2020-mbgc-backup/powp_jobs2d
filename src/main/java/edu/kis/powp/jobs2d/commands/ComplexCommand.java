package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    ArrayList<DriverCommand> commands;

    public ComplexCommand(){
        commands = new ArrayList<>();
    }

    public void addCommand(DriverCommand command){
        commands.add(command);
    }

    @Override
    public void execute(Job2dDriver driver) {
        commands.forEach(c -> c.execute(driver));
    }
}
