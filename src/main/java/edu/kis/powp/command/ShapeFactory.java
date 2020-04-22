package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public static DriverCommand getShape(DriverManager driverManager, ShapeTypeEnum shape) {
        List<DriverCommand> commandList = new ArrayList<>();
        switch (shape) {
            case RECTANGLE:
                return createRectangle(driverManager.getCurrentDriver(), commandList);
            case SQUARE:
                return createSquare(driverManager.getCurrentDriver(), commandList);
            case TRIANGLE:
                return createTriangle(driverManager.getCurrentDriver(), commandList);
            default:
                return new ComplexCommand();
        }

    }


    public static ComplexCommand createRectangle(Job2dDriver driver, List<DriverCommand> commandList) {
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(100, 0, driver));
        commandList.add(new OperateToCommand(100, 150, driver));
        commandList.add(new OperateToCommand(0, 150, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }

    public static ComplexCommand createSquare(Job2dDriver driver, List<DriverCommand> commandList) {
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(100, 0, driver));
        commandList.add(new OperateToCommand(100, 100, driver));
        commandList.add(new OperateToCommand(0, 100, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }

    public static ComplexCommand createTriangle(Job2dDriver driver, List<DriverCommand> commandList) {
        commandList.add(new SetPositionCommand(100, -100, driver));
        commandList.add(new OperateToCommand(0, 100, driver));
        commandList.add(new OperateToCommand(-100, -100, driver));
        commandList.add(new OperateToCommand(100, -100, driver));
        return new ComplexCommand(commandList);
    }
}
