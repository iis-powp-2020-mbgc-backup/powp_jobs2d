package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class TestFigures {
    public static DriverCommand Rectangle(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(job2dDriver, 100, 20));
        commands.add(new OperateToCommand(job2dDriver, 20, -100));
        commands.add(new OperateToCommand(job2dDriver, -100, -20));
        commands.add(new OperateToCommand(job2dDriver, -20, 100));
        commands.add(new OperateToCommand(job2dDriver, 100, 20));
        return new ComplexCommand(commands);
    }

    public static DriverCommand Five(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(job2dDriver, -150, -100));
        commands.add(new OperateToCommand(job2dDriver, -150, -50));
        commands.add(new OperateToCommand(job2dDriver, -100, -50));
        commands.add(new OperateToCommand(job2dDriver, -100, -100));
        commands.add(new OperateToCommand(job2dDriver, -50, -100));
        commands.add(new OperateToCommand(job2dDriver, -50, -50));
        return new ComplexCommand(commands);
    }
}
