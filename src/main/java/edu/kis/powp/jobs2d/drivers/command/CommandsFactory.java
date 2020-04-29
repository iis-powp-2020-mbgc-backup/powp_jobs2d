package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;


public class CommandsFactory {

    public static ComplexCommand createAngle(Job2dDriver Driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(70, -70, Driver));
        command.addCommand(new OperateToCommand(70, 70, Driver));
        command.addCommand(new OperateToCommand(-70, 10, Driver));


        return command;
    }
    public static ComplexCommand createTriangle(Job2dDriver Driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(-100, 100, Driver));
        command.addCommand(new OperateToCommand(0, -100, Driver));
        command.addCommand(new OperateToCommand(100, 100, Driver));
        command.addCommand(new OperateToCommand(-100, 100, Driver));

        return command;
    }
    public static ComplexCommand createRectangle(Job2dDriver Driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(70, -100, Driver));
        command.addCommand(new OperateToCommand(70, 100, Driver));
        command.addCommand(new OperateToCommand(-70, 100, Driver));
        command.addCommand(new OperateToCommand(-70, -100, Driver));
        command.addCommand(new OperateToCommand(70, -100, Driver));

        return command;
    }

}