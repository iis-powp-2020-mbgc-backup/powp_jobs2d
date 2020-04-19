package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class FiguresFactory {
    public static DriverCommand Square(Job2dDriver driver){
        ArrayList<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(0, 150, driver));
        commandList.add(new OperateToCommand(150 , 150, driver));
        commandList.add(new OperateToCommand(150, 0, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
        }

    public static DriverCommand Triangle(Job2dDriver driver){
        ArrayList<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(80 , 180, driver));
        commandList.add(new OperateToCommand(180, 0, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }

    public static DriverCommand Rectangle(Job2dDriver driver){
        ArrayList<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(0 , 180, driver));
        commandList.add(new OperateToCommand(60, 180, driver));
        commandList.add(new OperateToCommand(60, 0, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }
}


