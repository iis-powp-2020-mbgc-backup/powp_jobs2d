package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommandFactory {
    public static DriverCommand rectangle(Job2dDriver driver, int x, int y, int w, int h) {
        CommandBuilder commandBuilder = new CommandBuilder();
        commandBuilder.add(new SetPositionCommand(driver, x, y));
        commandBuilder.add(new OperateToCommand(driver, x + w, y));
        commandBuilder.add(new OperateToCommand(driver, x + w, y + h));
        commandBuilder.add(new OperateToCommand(driver, x, y + h));
        commandBuilder.add(new OperateToCommand(driver, x, y));

        return commandBuilder.build();
    }

    public static DriverCommand circle(Job2dDriver driver, int x, int y, int r) {
        CommandBuilder commandBuilder = new CommandBuilder();
        double prevX = r;
        double prevY = r;
        commandBuilder.add(new SetPositionCommand(driver, (int) prevX + x, (int) prevY + y));

        final int SEGMENT_COUNT = 24;
        double angle = (2 * Math.PI) / SEGMENT_COUNT;
        for (int i = 0; i < SEGMENT_COUNT; i++) {
            double newX = prevX * Math.cos(angle) - prevY * Math.sin(angle);
            double newY = prevX * Math.sin(angle) + prevY * Math.cos(angle);
            commandBuilder.add(new OperateToCommand(driver, (int) newX + x, (int) newY + y));

            prevX = newX;
            prevY = newY;
        }

        return commandBuilder.build();
    }
}
