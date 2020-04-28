package edu.kis.powp.jobs2d.drivers.Command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    ArrayList<DriverCommand> commands;

    public ComplexCommand() {
        commands = new ArrayList<>();
    }

    public void addCommand(DriverCommand command){
        commands.add(command);
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        System.out.println("complex execute");
        for(int i = 0; i < commands.size(); i++){
            commands.get(i).execute(job2dDriver);
        }
    }
}
