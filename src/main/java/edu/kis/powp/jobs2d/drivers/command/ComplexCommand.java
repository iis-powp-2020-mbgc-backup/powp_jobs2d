package edu.kis.powp.jobs2d.drivers.command;
import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand
{
    private List<DriverCommand> commands;

    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        for (DriverCommand command : this.commands) {
            command.execute();
        }
    }
}