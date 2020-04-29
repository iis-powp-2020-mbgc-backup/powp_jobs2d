package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {

    public static ComplexCommand addSquare(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(50, -50, driver));
        command.addCommand(new OperateToCommand(50, 50, driver));
        command.addCommand(new OperateToCommand(-50, 50, driver));
        command.addCommand(new OperateToCommand(-50, -50, driver));
        command.addCommand(new OperateToCommand(50, -50, driver));

        return command;
    }

    public static ComplexCommand addTriangle(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(50, -50, driver));
        command.addCommand(new OperateToCommand(0, 50, driver));
        command.addCommand(new OperateToCommand(-50, -50, driver));
        command.addCommand(new OperateToCommand(50, -50, driver));

        return command;
    }

    public static ComplexCommand addRectangle(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(0, 0, driver));
        command.addCommand(new OperateToCommand(0, 100, driver));
        command.addCommand(new OperateToCommand(50, 100, driver));
        command.addCommand(new OperateToCommand(50, 0, driver));
        command.addCommand(new OperateToCommand(0, 0, driver));

        return command;
    }
}
