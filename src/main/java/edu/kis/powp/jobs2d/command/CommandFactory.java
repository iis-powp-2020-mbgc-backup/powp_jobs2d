package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.ArrayList;

public class CommandFactory {
    private CommandFactory(){}

    public static DriverCommand drawRectangle(Job2dDriver driver) {
        ArrayList<DriverCommand> commandsList = new ArrayList<>();
        commandsList.add(new SetPositionCommand(0, 0, driver));
        commandsList.add(new OperateToCommand(200, 0, driver));
        commandsList.add(new OperateToCommand(0, 100, driver));
        commandsList.add(new SetPositionCommand(200, 100, driver));
        commandsList.add(new OperateToCommand(200, 0, driver));
        commandsList.add(new OperateToCommand(0, 100, driver));
        return new ComplexCommand(commandsList);
    }

    public static DriverCommand drawTrapezium(Job2dDriver driver) {
        ArrayList<DriverCommand> commandsList = new ArrayList<>();
        commandsList.add(new SetPositionCommand(0, 0, driver));
        commandsList.add(new OperateToCommand(100, 0, driver));
        commandsList.add(new OperateToCommand(20, 100, driver));
        commandsList.add(new SetPositionCommand(80, 100, driver));
        commandsList.add(new OperateToCommand(20, 100, driver));
        commandsList.add(new OperateToCommand(100, 0, driver));
        return new ComplexCommand(commandsList);
    }

    public static DriverCommand drawTriangle(Job2dDriver driver) {
        ArrayList<DriverCommand> commandsList = new ArrayList<>();
        commandsList.add(new SetPositionCommand(0, 0, driver));
        commandsList.add(new OperateToCommand(100, 0, driver));
        commandsList.add(new OperateToCommand(0, 100, driver));
        commandsList.add(new SetPositionCommand(0, 100, driver));
        commandsList.add(new OperateToCommand(100, 0, driver));
        return new ComplexCommand(commandsList);
    }
}