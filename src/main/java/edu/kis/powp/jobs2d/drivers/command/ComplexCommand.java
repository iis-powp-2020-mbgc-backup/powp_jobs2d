package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands;

    private ComplexCommand(ComplexCommandBuilder complexCommandBuilder) {
        commands = Collections.unmodifiableList(complexCommandBuilder.commands);
    }

    public static class ComplexCommandBuilder{

        private List<DriverCommand> commands;
        private ComplexCommandBuilder(){
            commands = new ArrayList<>();
        }

        public ComplexCommandBuilder addCommand(DriverCommand command){
            commands.add(command);
            return this;
        }

        public ComplexCommand build(){
            return new ComplexCommand(this);
        }
    }

    public static ComplexCommandBuilder builder(){
        return new ComplexCommandBuilder();
    }

    @Override
    public void setDriver(Job2dDriver driver){
        for (DriverCommand command : commands) {
            command.setDriver(driver);
        }
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands) {
            command.execute();
        }
    }
}
