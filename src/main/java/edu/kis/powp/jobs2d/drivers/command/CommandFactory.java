package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {

    public static DriverCommand getRectangleCommand(Job2dDriver job2dDriver)
    {
        CommandListBuilder commandListBuilder = new CommandListBuilder();

        commandListBuilder.addCommand(new SetPositionCommand(0, 0, job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(0, 50 , job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(100, 50 , job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(100, 0 , job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(0, 0 , job2dDriver));

        return commandListBuilder.getComplexCommand();
    }

    public static DriverCommand getSquareCommand(Job2dDriver job2dDriver)
    {
        CommandListBuilder commandListBuilder = new CommandListBuilder();

        commandListBuilder.addCommand(new SetPositionCommand(0, 0, job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(0, 40, job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(40, 40, job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(40, 0, job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(0, 0, job2dDriver));

        return commandListBuilder.getComplexCommand();
    }

    public static DriverCommand getTriangleCommand(Job2dDriver job2dDriver)
    {
        CommandListBuilder commandListBuilder = new CommandListBuilder();

        commandListBuilder.addCommand(new SetPositionCommand(0, 0, job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(-40, 40, job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(40, 40, job2dDriver));
        commandListBuilder.addCommand(new OperateToCommand(0, 0, job2dDriver));

        return commandListBuilder.getComplexCommand();
    }
}
