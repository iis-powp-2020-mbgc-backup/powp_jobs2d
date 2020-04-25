package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class CommandFactory {

    public static DriverCommand drawTriangle(Job2dDriver job2dDriver) {
        ArrayList<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0, 0, job2dDriver));
        commands.add(new OperateToCommand(200, -200, job2dDriver));
        commands.add(new OperateToCommand(-200, -200, job2dDriver));
        commands.add(new OperateToCommand(0, 0, job2dDriver));
        return new Command(commands);
    }

    public static DriverCommand drawRect(Job2dDriver job2dDriver) {
        ArrayList<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0, 0, job2dDriver));
        commands.add(new OperateToCommand(0, 50, job2dDriver));
        commands.add(new OperateToCommand(50, 50, job2dDriver));
        commands.add(new OperateToCommand(50, 0, job2dDriver));
        commands.add(new OperateToCommand(0, 0, job2dDriver));
        return new Command(commands);
    }

    }


