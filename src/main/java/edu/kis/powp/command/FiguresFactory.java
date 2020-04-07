package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class FiguresFactory {
    public static DriverCommand Rectangle(Job2dDriver driver){
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(driver, 0, 0));
        commandList.add(new OperateToCommand(driver, 0, 200));
        commandList.add(new OperateToCommand(driver, 100 , 200));
        commandList.add(new OperateToCommand(driver, 100, 0));
        commandList.add(new OperateToCommand(driver, 0, 0));
        return new ComplexCommand(commandList);
    }

    public static DriverCommand Trangle(Job2dDriver driver){
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(driver, 0, 0));
        commandList.add(new OperateToCommand(driver, 60 , 200));
        commandList.add(new OperateToCommand(driver, 200, 0));
        commandList.add(new OperateToCommand(driver, 0, 0));
        return new ComplexCommand(commandList);
    }
}
