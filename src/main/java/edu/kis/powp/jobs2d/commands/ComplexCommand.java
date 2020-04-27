package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> commands = new ArrayList<>();

    public ComplexCommand() {
    }

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }

    public void addCommand(DriverCommand command) {
        if( command != null ){
            this.commands.add(command);
        }
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands) {
            command.execute();
        }
    }
}