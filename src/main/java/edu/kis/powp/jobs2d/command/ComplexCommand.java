package edu.kis.powp.jobs2d.command;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commandsList = null;

    ComplexCommand(List<DriverCommand> commandsList) {
        this.commandsList = commandsList;
    }

    @Override
    public void execute() {
        for (DriverCommand command: commandsList){
            command.execute();
        }
    }
}