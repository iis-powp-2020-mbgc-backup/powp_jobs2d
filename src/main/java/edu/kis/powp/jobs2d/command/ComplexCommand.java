package edu.kis.powp.jobs2d.command;

import java.util.Vector;

public class ComplexCommand implements DriverCommand {
    private Vector<DriverCommand> commandSeq = new Vector<DriverCommand>();

    public ComplexCommand(){
        commandSeq = new Vector<DriverCommand>();
    }

    public void add(DriverCommand command) {
        commandSeq.add(command);
    }

    @Override
    public void execute(){
        for (DriverCommand command : commandSeq) {
            command.execute();
        }
    }
}
