package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class CommandFactory {
    public static DriverCommand drawRectangle(Job2dDriver driver) {
        ArrayList<DriverCommand> driverCommands = new ArrayList<>();
        driverCommands.add(new SetPositionCommand(100, 50, driver));
        driverCommands.add(new OperateToCommand(-100, 50, driver));
        driverCommands.add(new OperateToCommand(-100, -50, driver));
        driverCommands.add(new OperateToCommand(100, -50, driver));
        driverCommands.add(new OperateToCommand(100, 50, driver));
        return new ComplexCommand(driverCommands);
    }

    public static DriverCommand drawCircle(Job2dDriver driver) {
        ArrayList<DriverCommand> driverCommands = new ArrayList<>();
        driverCommands.add(new SetPositionCommand(0, -100, driver));
        for (int y = -99; y <= 100; y += 1) {
            int x = (int)Math.round(Math.sqrt(10000 - y*y));
            driverCommands.add(new OperateToCommand(x, y, driver));
        }
        for (int y = 99; y >= -100; y -= 1) {
            int x = -(int)Math.round(Math.sqrt(10000 - y*y));
            driverCommands.add(new OperateToCommand(x, y, driver));
        }
        return new ComplexCommand(driverCommands);
    }

    public static DriverCommand drawHexagon(Job2dDriver driver) {
        ArrayList<DriverCommand> driverCommands = new ArrayList<>();
        driverCommands.add(new SetPositionCommand(50, 50, driver));
        driverCommands.add(new OperateToCommand(-50, 50, driver));
        driverCommands.add(new OperateToCommand(-75, 0, driver));
        driverCommands.add(new OperateToCommand(-50, -50, driver));
        driverCommands.add(new OperateToCommand(50, -50, driver));
        driverCommands.add(new OperateToCommand(75, 0, driver));
        driverCommands.add(new OperateToCommand(50, 50, driver));
        return new ComplexCommand(driverCommands);
    }
}
