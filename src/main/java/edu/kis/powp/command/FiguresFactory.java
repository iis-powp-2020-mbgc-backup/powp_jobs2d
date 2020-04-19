package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class FiguresFactory {
    public static DriverCommand Square(Job2dDriver driver){
        ArrayList<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(0, 200, driver));
        commandList.add(new OperateToCommand(200 , 200, driver));
        commandList.add(new OperateToCommand(200, 0, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }
    public static DriverCommand Rectangle(Job2dDriver driver){
        ArrayList<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(-100, -100, driver));
        commandList.add(new OperateToCommand(-100 , 200, driver));
        commandList.add(new OperateToCommand(0, 200, driver));
        commandList.add(new OperateToCommand(0, -100, driver));
        commandList.add(new OperateToCommand(-100, -100, driver));
        return new ComplexCommand(commandList);
    }
    public static DriverCommand SpecialShape(Job2dDriver driver){
        ArrayList<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(0, -10, driver));
        commandList.add(new OperateToCommand(-10, -300, driver));
        commandList.add(new OperateToCommand(-10, 0, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }
    public static DriverCommand Triangle(Job2dDriver driver){
        ArrayList<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(100 , 200, driver));
        commandList.add(new OperateToCommand(200, 0, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }
}