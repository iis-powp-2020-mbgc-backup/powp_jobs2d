package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {

    public static DriverCommand createSquareCommand(Job2dDriver driver) {
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();
        complexCommandBuilder.addCommand(new SetPositionCommand(-50, -50, driver))
                .addCommand(new OperateToCommand(-50, 50, driver))
                .addCommand(new OperateToCommand(50, 50, driver))
                .addCommand(new OperateToCommand(50, -50, driver))
                .addCommand(new OperateToCommand(-50, -50, driver));
        return complexCommandBuilder.build();
    }

    public static DriverCommand createRectangleCommand(Job2dDriver driver) {
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();
        complexCommandBuilder.addCommand(new SetPositionCommand(-50, -75, driver))
                .addCommand(new OperateToCommand(-50, 75, driver))
                .addCommand(new OperateToCommand(50, 75, driver))
                .addCommand(new OperateToCommand(50, -75, driver))
                .addCommand(new OperateToCommand(-50, -75, driver));
        return complexCommandBuilder.build();
    }

    public static DriverCommand createPentagonCommand(Job2dDriver driver) {
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();
        complexCommandBuilder.addCommand(new SetPositionCommand(0, -50, driver))
                .addCommand(new OperateToCommand(-48, -15, driver))
                .addCommand(new OperateToCommand(-29, 40, driver))
                .addCommand(new OperateToCommand(29, 40, driver))
                .addCommand(new OperateToCommand(48, -15, driver))
                .addCommand(new OperateToCommand(0, -50, driver));
        return complexCommandBuilder.build();
    }

    public static DriverCommand createHexagonCommand(Job2dDriver driver) {
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();
        complexCommandBuilder.addCommand(new SetPositionCommand(25, -43, driver))
                .addCommand(new OperateToCommand(-25, -43, driver))
                .addCommand(new OperateToCommand(-50, 0, driver))
                .addCommand(new OperateToCommand(-25, 43, driver))
                .addCommand(new OperateToCommand(25, 43, driver))
                .addCommand(new OperateToCommand(50, 0, driver))
                .addCommand(new OperateToCommand(25, -43, driver));
        return complexCommandBuilder.build();
    }
}
