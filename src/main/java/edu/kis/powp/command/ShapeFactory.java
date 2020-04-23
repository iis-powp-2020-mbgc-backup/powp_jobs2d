package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public static DriverCommand getShape(DriverManager driverManager, ShapeTypeEnum shape) {
        List<DriverCommand> commandList = new ArrayList<>();
        switch (shape) {
            case RECTANGLE:
                return createRectangle(driverManager, commandList);
            case SQUARE:
                return createSquare(driverManager, commandList);
            case TRIANGLE:
                return createTriangle(driverManager, commandList);
            default:
                return new ComplexCommand();
        }
    }

    public static ComplexCommand createRectangle(DriverManager driverManager, List<DriverCommand> commandList) {
        commandList.add(new SetPositionCommand(0, 0, driverManager));
        commandList.add(new OperateToCommand(100, 0, driverManager));
        commandList.add(new OperateToCommand(100, 150, driverManager));
        commandList.add(new OperateToCommand(0, 150, driverManager));
        commandList.add(new OperateToCommand(0, 0, driverManager));
        return new ComplexCommand(commandList);
    }

    public static ComplexCommand createSquare(DriverManager driverManager, List<DriverCommand> commandList) {
        commandList.add(new SetPositionCommand(0, 0, driverManager));
        commandList.add(new OperateToCommand(100, 0, driverManager));
        commandList.add(new OperateToCommand(100, 100, driverManager));
        commandList.add(new OperateToCommand(0, 100, driverManager));
        commandList.add(new OperateToCommand(0, 0, driverManager));
        return new ComplexCommand(commandList);
    }

    public static ComplexCommand createTriangle(DriverManager driverManager, List<DriverCommand> commandList) {
        commandList.add(new SetPositionCommand(100, -100, driverManager));
        commandList.add(new OperateToCommand(0, 100, driverManager));
        commandList.add(new OperateToCommand(-100, -100, driverManager));
        commandList.add(new OperateToCommand(100, -100, driverManager));
        return new ComplexCommand(commandList);
    }
}
