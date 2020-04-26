package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    public static DriverCommand getSquareCommand(){
        List<DriverCommand> driverCommands = new ArrayList<DriverCommand>();
        driverCommands.add(new SetPositionCommand(50,50));
        driverCommands.add(new OperateToCommand(-50,50));
        driverCommands.add(new OperateToCommand(-50,-50));
        driverCommands.add(new OperateToCommand(50,-50));
        driverCommands.add(new OperateToCommand(50,50));
        ComplexCommand complexCommand = new ComplexCommand(driverCommands);
        return complexCommand;
    }

    public static DriverCommand getRectangleCommand(){
        List<DriverCommand> driverCommands = new ArrayList<DriverCommand>();
        driverCommands.add(new SetPositionCommand(100,50));
        driverCommands.add(new OperateToCommand(-100,50));
        driverCommands.add(new OperateToCommand(-100,-50));
        driverCommands.add(new OperateToCommand(100,-50));
        driverCommands.add(new OperateToCommand(100,50));
        ComplexCommand complexCommand = new ComplexCommand(driverCommands);
        return complexCommand;
    }
    public static DriverCommand getTrapeziumCommand(){
        List<DriverCommand> driverCommands = new ArrayList<DriverCommand>();
        driverCommands.add(new SetPositionCommand(100,50));
        driverCommands.add(new OperateToCommand(-100,50));
        driverCommands.add(new OperateToCommand(-150,-50));
        driverCommands.add(new OperateToCommand(150,-50));
        driverCommands.add(new OperateToCommand(100,50));
        ComplexCommand complexCommand = new ComplexCommand(driverCommands);
        return complexCommand;
    }

}
