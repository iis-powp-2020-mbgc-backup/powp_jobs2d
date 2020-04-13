package edu.kis.powp.command;


import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {
    private CommandFactory() {}

    public static DriverCommand getRectangleCommand(Job2dDriver driver) {
        CommandBuilder cb = new CommandBuilder();
        return cb.
                addCommand(new SetPositionCommand(driver, 0, 0)).
                addCommand(new OperateToCommand(driver, 60, 0)).
                addCommand(new OperateToCommand(driver, 60, 120)).
                addCommand(new OperateToCommand(driver, 0, 120)).
                addCommand(new OperateToCommand(driver, 0, 0)).
                create();
    }

    public static DriverCommand getTriangleCommand(Job2dDriver driver) {
        CommandBuilder cb = new CommandBuilder();
        return cb.
                addCommand(new SetPositionCommand(driver, 0, 0)).
                addCommand(new OperateToCommand(driver, 30, 60)).
                addCommand(new OperateToCommand(driver, 60, 0)).
                addCommand(new OperateToCommand(driver, 0, 0)).
                create();
    }
}
