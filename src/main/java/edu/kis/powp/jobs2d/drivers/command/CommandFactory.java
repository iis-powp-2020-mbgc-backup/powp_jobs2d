package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    public static DriverCommand drawRectangleCommand(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addJob(new SetPositionCommand(0, 0, job2dDriver));
        complexCommand.addJob(new OperateToCommand(200, 0, job2dDriver));
        complexCommand.addJob(new OperateToCommand(200, 100, job2dDriver));
        complexCommand.addJob(new OperateToCommand(0, 100, job2dDriver));
        complexCommand.addJob(new OperateToCommand(0, 0, job2dDriver));
        complexCommand.execute();
        return complexCommand;
    }

    public static DriverCommand drawCubeCommand(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addJob(new SetPositionCommand(0, 0, job2dDriver));
        complexCommand.addJob(new OperateToCommand(100, 0, job2dDriver));
        complexCommand.addJob(new OperateToCommand(150, 50, job2dDriver));
        complexCommand.addJob(new OperateToCommand(50, 50, job2dDriver));
        complexCommand.addJob(new OperateToCommand(0, 0, job2dDriver));
        complexCommand.addJob(new SetPositionCommand(50, 50, job2dDriver));
        complexCommand.addJob(new OperateToCommand(50, 150, job2dDriver));
        complexCommand.addJob(new OperateToCommand(150, 150, job2dDriver));
        complexCommand.addJob(new OperateToCommand(100, 100, job2dDriver));
        complexCommand.addJob(new OperateToCommand(0, 100, job2dDriver));
        complexCommand.addJob(new OperateToCommand(50, 150, job2dDriver));
        complexCommand.addJob(new SetPositionCommand(0, 0, job2dDriver));
        complexCommand.addJob(new OperateToCommand(0, 100, job2dDriver));
        complexCommand.addJob(new SetPositionCommand(100, 0, job2dDriver));
        complexCommand.addJob(new OperateToCommand(100, 100, job2dDriver));
        complexCommand.addJob(new SetPositionCommand(150, 50, job2dDriver));
        complexCommand.addJob(new OperateToCommand(150, 150, job2dDriver));

        complexCommand.execute();
        return complexCommand;
    }

    public static DriverCommand drawTrapezeCommand(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addJob(new SetPositionCommand(50, 0, job2dDriver));
        complexCommand.addJob(new OperateToCommand(150, 0, job2dDriver));
        complexCommand.addJob(new OperateToCommand(200, 100, job2dDriver));
        complexCommand.addJob(new OperateToCommand(0, 100, job2dDriver));
        complexCommand.addJob(new OperateToCommand(50, 0, job2dDriver));
        complexCommand.execute();
        return complexCommand;
    }

}

