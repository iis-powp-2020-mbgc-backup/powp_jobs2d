package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;


public class commandFactory {

    public static ComplexCommand createSquare(Job2dDriver Driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(50, -50, Driver));
        command.addCommand(new OperateToCommand(50, 50, Driver));
        command.addCommand(new OperateToCommand(-50, 50, Driver));
        command.addCommand(new OperateToCommand(-50, -50, Driver));
        command.addCommand(new OperateToCommand(50, -50, Driver));

        return command;
    }
    public static ComplexCommand createTriangle(Job2dDriver Driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(-50, 50, Driver));
        command.addCommand(new OperateToCommand(0, -50, Driver));
        command.addCommand(new OperateToCommand(50, 50, Driver));
        command.addCommand(new OperateToCommand(-50, 50, Driver));

        return command;
    }
    public static ComplexCommand createRectangle(Job2dDriver Driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(50, -100, Driver));
        command.addCommand(new OperateToCommand(50, 100, Driver));
        command.addCommand(new OperateToCommand(-50, 100, Driver));
        command.addCommand(new OperateToCommand(-50, -100, Driver));
        command.addCommand(new OperateToCommand(50, -100, Driver));

        return command;
    }

}