package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;


public class CommandFactory {

    public static ComplexCommand createTriangle(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driver, 100, -100));
        command.addCommand(new OperateToCommand(driver,0, 100));
        command.addCommand(new OperateToCommand(driver,-100, -100));
        command.addCommand(new OperateToCommand(driver,100, -100));

        return command;
    }

    public static ComplexCommand createRectangle(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driver,30, 90));
        command.addCommand(new OperateToCommand(driver,30, -90));
        command.addCommand(new OperateToCommand(driver,-30, -90));
        command.addCommand(new OperateToCommand(driver,-30, 90));
        command.addCommand(new OperateToCommand(driver,30, 90));

        return command;
    }
}