package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class MyFigures {

    public static DriverCommand Rectangle(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(job2dDriver, 60, 120));
        commands.add(new OperateToCommand(job2dDriver, 60, -120));
        commands.add(new OperateToCommand(job2dDriver, -60, -120));
        commands.add(new OperateToCommand(job2dDriver, -60, 120));
        commands.add(new OperateToCommand(job2dDriver, 60, 120));
        return new ComplexCommand(commands);
    }

    public static DriverCommand Triangle(Job2dDriver job2dDriver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(job2dDriver, 0, -60));
        commands.add(new OperateToCommand(job2dDriver, 60, 60));
        commands.add(new OperateToCommand(job2dDriver, -60, 60));
        commands.add(new OperateToCommand(job2dDriver, 0, -60));
        return new ComplexCommand(commands);
    }

}
