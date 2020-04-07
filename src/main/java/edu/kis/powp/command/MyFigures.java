package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class MyFigures {
    public static DriverCommand Rectangle(Job2dDriver job2dDriver){
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(job2dDriver, 0 ,0));
        commands.add(new OperateToCommand(job2dDriver, 0 ,100));
        commands.add(new OperateToCommand(job2dDriver, 50 ,100));
        commands.add(new OperateToCommand(job2dDriver, 50 ,0));
        commands.add(new OperateToCommand(job2dDriver, 0 ,0));
        return new ComplexCommand(commands);
    }

    public static DriverCommand Triangle(Job2dDriver job2dDriver){
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(job2dDriver, 0 ,0));
        commands.add(new OperateToCommand(job2dDriver, 0 ,100));
        commands.add(new OperateToCommand(job2dDriver, 100 ,100));
        commands.add(new OperateToCommand(job2dDriver, 0 ,0));
        return new ComplexCommand(commands);
    }
}
