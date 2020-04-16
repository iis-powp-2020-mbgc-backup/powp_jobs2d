package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {

    public static DriverCommand getRectangleCommand(Job2dDriver job2dDriver){
        CommandBuilder commandBuilder = new CommandBuilder();

        commandBuilder.addCommand(new SetPositionCommand(job2dDriver,0,0));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,0,50));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,100,50));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,100,0));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,0,0));

        return commandBuilder.getComplexCommand();
    }

    public static DriverCommand getParallelogramCommand(Job2dDriver job2dDriver){
        CommandBuilder commandBuilder = new CommandBuilder();

        commandBuilder.addCommand(new SetPositionCommand(job2dDriver,0,0));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,15,50));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,115,50));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,100,0));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,0,0));

        return commandBuilder.getComplexCommand();
    }

    public static DriverCommand getDiamondCommand(Job2dDriver job2dDriver){
        CommandBuilder commandBuilder = new CommandBuilder();

        commandBuilder.addCommand(new SetPositionCommand(job2dDriver,40,0));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,0,40));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,40,80));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,80,40));
        commandBuilder.addCommand(new OperateToCommand(job2dDriver,40,0));

        return commandBuilder.getComplexCommand();
    }
}
