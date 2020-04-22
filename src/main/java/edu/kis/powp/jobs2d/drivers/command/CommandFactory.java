package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;


public class CommandFactory {

    public static ComplexCommand createTriangle(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(100, -100, driver));
        command.addCommand(new OperateToCommand(0, 100, driver));
        command.addCommand(new OperateToCommand(-100, -100, driver));
        command.addCommand(new OperateToCommand(100, -100, driver));

        return command;
    }

    public static ComplexCommand createSquare(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(100, -100, driver));
        command.addCommand(new OperateToCommand(100, 100, driver));
        command.addCommand(new OperateToCommand(-100, 100, driver));
        command.addCommand(new OperateToCommand(-100, -100, driver));
        command.addCommand(new OperateToCommand(100, -100, driver));

        return command;
    }

    public static ComplexCommand createWeirdFigure(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(-100, -100, driver));
        command.addCommand(new OperateToCommand(100, 0, driver));
        command.addCommand(new OperateToCommand(-100, 100, driver));
        command.addCommand(new OperateToCommand(0, -100, driver));
        command.addCommand(new OperateToCommand(-100, 0, driver));
        command.addCommand(new OperateToCommand(100, -100, driver));

        return command;
    }
}