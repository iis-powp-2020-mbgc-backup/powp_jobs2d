package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {
    public static ComplexCommand createTriangle(Job2dDriver job2driver) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(job2driver, 100, -100));
        complexCommand.addCommand(new OperateToCommand(job2driver, 0, 100));
        complexCommand.addCommand(new OperateToCommand(job2driver, -100, -100));
        complexCommand.addCommand(new OperateToCommand(job2driver, 100, -100));

        return complexCommand;
    }

    public static ComplexCommand createRectangle(Job2dDriver job2driver) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(job2driver, 30, 90));
        complexCommand.addCommand(new OperateToCommand(job2driver, 30, -90));
        complexCommand.addCommand(new OperateToCommand(job2driver, -30, -90));
        complexCommand.addCommand(new OperateToCommand(job2driver, -30, 90));
        complexCommand.addCommand(new OperateToCommand(job2driver, 30, 90));

        return complexCommand;
    }

    public static ComplexCommand createDoubledTriangle(Job2dDriver job2driver) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(job2driver, 0, 0));
        complexCommand.addCommand(new OperateToCommand(job2driver, -50, 50));
        complexCommand.addCommand(new OperateToCommand(job2driver, 50, 50));
        complexCommand.addCommand(new OperateToCommand(job2driver, -50, -50));
        complexCommand.addCommand(new OperateToCommand(job2driver, -150, 150));
        complexCommand.addCommand(new OperateToCommand(job2driver, 150, 150));
        complexCommand.addCommand(new OperateToCommand(job2driver, -50, -50));

        return complexCommand;
    }
}
