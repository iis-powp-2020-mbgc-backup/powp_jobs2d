package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommandFactory {
    public static ComplexCommand Square(Job2dDriver job2dDriver, int x, int y, int length) {
        ComplexCommand complexCommand = new ComplexCommand(job2dDriver);

        complexCommand.add(new SetPositionCommand(x, y, job2dDriver));
        complexCommand.add(new OperateToCommand(x + length, y, job2dDriver));
        complexCommand.add(new OperateToCommand(x + length, y + length, job2dDriver));
        complexCommand.add(new OperateToCommand(x, y + length, job2dDriver));
        complexCommand.add(new OperateToCommand(x, y, job2dDriver));

        return complexCommand;
    }

    public static ComplexCommand Rectangle(Job2dDriver job2dDriver, int x, int y, int width, int height) {
        ComplexCommand complexCommand = new ComplexCommand(job2dDriver);

        complexCommand.add(new SetPositionCommand(x, y, job2dDriver));
        complexCommand.add(new OperateToCommand(x + width, y, job2dDriver));
        complexCommand.add(new OperateToCommand(x + width, y + height, job2dDriver));
        complexCommand.add(new OperateToCommand(x, y + height, job2dDriver));
        complexCommand.add(new OperateToCommand(x, y, job2dDriver));

        return complexCommand;
    }
}
