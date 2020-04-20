package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class BasicFiguresFactory {

    public static DriverCommand getRectangle(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(90, 30, job2dDriver));
        commands.add(new OperateToCommand(90, -30, job2dDriver));
        commands.add(new OperateToCommand(-90, -30, job2dDriver));
        commands.add(new OperateToCommand(-90, 30, job2dDriver));
        commands.add(new OperateToCommand(90, 30, job2dDriver));
        return new ComplexCommand(commands);
    }

    public static DriverCommand getTriangle(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(0, -45, job2dDriver));
        commands.add(new OperateToCommand(45, 45, job2dDriver));
        commands.add(new OperateToCommand(-45, 45, job2dDriver));
        commands.add(new OperateToCommand(0, -45, job2dDriver));
        return new ComplexCommand(commands);
    }

    public static DriverCommand getSmallSquare(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(30,30, job2dDriver));
        commands.add(new OperateToCommand(-30, 30, job2dDriver));
        commands.add(new OperateToCommand(-30, -30, job2dDriver));
        commands.add(new OperateToCommand(30, -30, job2dDriver));
        commands.add(new OperateToCommand(30, 30, job2dDriver));
        return new ComplexCommand(commands);
    }

    public static DriverCommand getBigSquare(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(90,90, job2dDriver));
        commands.add(new OperateToCommand(-90, 90, job2dDriver));
        commands.add(new OperateToCommand(-90, -90, job2dDriver));
        commands.add(new OperateToCommand(90, -90, job2dDriver));
        commands.add(new OperateToCommand(90, 90, job2dDriver));
        return new ComplexCommand(commands);
    }
}
