package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {
    public static DriverCommand drawRectangleCommand(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(-50, -50, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(150, -50, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(150, 50, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-50, 50, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-50, -50, job2dDriver));
        complexCommand.execute();
        return complexCommand;
    }

    public static DriverCommand drawTriangleCommand(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 50, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(-50, -50, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(50, -50, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0, 50, job2dDriver));
        complexCommand.execute();
        return complexCommand;
    }


}
