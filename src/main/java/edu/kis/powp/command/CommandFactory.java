package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {

    public static ComplexCommand drawRectangle(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 0, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(100, 0, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(100, 150, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0, 150, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0, 0, job2dDriver));
        complexCommand.execute();

        return complexCommand;
    }

    public static ComplexCommand drawSquare(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 0, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(100, 0, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(100, 100, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0, 100, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0, 0, job2dDriver));
        complexCommand.execute();

        return complexCommand;
    }

    public static ComplexCommand drawTriangle(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 0, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(100, 0, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(50, 100, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0, 0, job2dDriver));
        complexCommand.execute();

        return complexCommand;
    }
}
