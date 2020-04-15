package edu.kis.powp.jobs2d.drivers.command;
import java.util.ArrayList;

public class ComplexCommand implements DriverCommand
{
    private ArrayList<DriverCommand> commands;

    public ComplexCommand() {
        commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands) {
            command.execute();
        }
    }
}