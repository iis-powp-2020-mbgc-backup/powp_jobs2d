package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    ComplexCommand(){
    }

    private List<DriverCommand> commands = new ArrayList<>();

    void addCommand(DriverCommand command) {
        this.commands.add(command);
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.size()  ; i++) {
            commands.get(i).execute();
        }
    }

}
