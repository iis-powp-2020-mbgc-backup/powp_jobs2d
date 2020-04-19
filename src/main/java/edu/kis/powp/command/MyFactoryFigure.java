package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class MyFactoryFigure {

    public static DriverCommand Rectangle(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(30, 90, job2dDriver));
        commands.add(new OperateToCommand(30, -90, job2dDriver));
        commands.add(new OperateToCommand(-30, -90, job2dDriver));
        commands.add(new OperateToCommand(-30, 90, job2dDriver));
        commands.add(new OperateToCommand(30, 90, job2dDriver));
        return new ComplexCommand(commands);
    }

    public static DriverCommand Triangle(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0, -30, job2dDriver));
        commands.add(new OperateToCommand(30, 30, job2dDriver));
        commands.add(new OperateToCommand(-30, 30, job2dDriver));
        commands.add(new OperateToCommand(0, -30, job2dDriver));
        return new ComplexCommand(commands);
    }

}
