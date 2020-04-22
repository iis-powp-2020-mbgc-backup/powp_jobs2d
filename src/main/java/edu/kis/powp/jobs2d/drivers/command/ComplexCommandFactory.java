package edu.kis.powp.jobs2d.drivers.command;

public class ComplexCommandFactory {
    public static DriverCommand square(int x, int y, int a) {
        ComplexCommandBuilder commandBuilder = new ComplexCommandBuilder();
        x -= (double) a / 2;
        y -= (double) a / 2;
        commandBuilder.addCommand(new SetPositionCommand(x, y));
        x += a;
        commandBuilder.addCommand(new OperateToCommand(x, y));
        y += a;
        commandBuilder.addCommand(new OperateToCommand(x, y));
        x -= a;
        commandBuilder.addCommand(new OperateToCommand(x, y));
        y -= a;
        commandBuilder.addCommand(new OperateToCommand(x, y));

        return commandBuilder.build();
    }
}

