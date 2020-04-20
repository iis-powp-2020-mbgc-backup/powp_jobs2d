package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommandFactory {
    public static ComplexCommand rectangle(Job2dDriver driver, int x, int y, int w, int h) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.add(new SetPositionCommand(driver, x, y));
        complexCommand.add(new OperateToCommand(driver, x + w, y));
        complexCommand.add(new OperateToCommand(driver, x + w, y + h));
        complexCommand.add(new OperateToCommand(driver, x, y + h));
        complexCommand.add(new OperateToCommand(driver, x, y));

        return complexCommand;
    }

    public static ComplexCommand circle(Job2dDriver driver, int x, int y, int r) {
        ComplexCommand complexCommand = new ComplexCommand();
        double prevX = r;
        double prevY = r;
        complexCommand.add(new SetPositionCommand(driver, (int) prevX + x, (int) prevY + y));

        final int SEGMENT_COUNT = 24;
        double angle = (2 * Math.PI) / SEGMENT_COUNT;
        for (int i = 0; i < SEGMENT_COUNT; i++) {
            double newX = prevX * Math.cos(angle) - prevY * Math.sin(angle);
            double newY = prevX * Math.sin(angle) + prevY * Math.cos(angle);
            complexCommand.add(new OperateToCommand(driver, (int) newX + x, (int) newY + y));

            prevX = newX;
            prevY = newY;
        }

        return complexCommand;
    }
}
