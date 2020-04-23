package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommandFactory {

    public ComplexCommand createRectangle(Job2dDriver job2dDriver) {

        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(job2dDriver, 0, 0));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, 0, 100));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, -200, 100));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, -200, 0));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, 0, 0));
        return complexCommand;
    }

    public ComplexCommand createCircle(Job2dDriver job2dDriver, int radius) {

        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(job2dDriver, 0, radius));
        for (int i = 0; i < 360; i++) {
            complexCommand.addCommand(new OperateToCommand(job2dDriver, (int) Math.round(radius * Math.sin(i)),
                    (int) Math.round(radius * Math.cos(i))));
        }
        return complexCommand;
    }
}
