package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {
    public static DriverCommand triangleCommand(Job2dDriver driver){
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(100, -100, driver));
        command.addCommand(new OperateToCommand(0,100, driver));
        command.addCommand(new OperateToCommand(-100,-100, driver));
        command.addCommand(new OperateToCommand(100,-100, driver));
        return command;
    }

    public static DriverCommand squareCommand(Job2dDriver driver){
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(100, -100, driver));
        command.addCommand(new OperateToCommand(100,100, driver));
        command.addCommand(new OperateToCommand(-100,100, driver));
        command.addCommand(new OperateToCommand(-100,-100, driver));
        command.addCommand(new OperateToCommand(100,-100, driver));
        return command;
    }

    public static DriverCommand parallelogramCommand(Job2dDriver driver){
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(100, -100, driver));
        command.addCommand(new OperateToCommand(170,100, driver));
        command.addCommand(new OperateToCommand(-100,100, driver));
        command.addCommand(new OperateToCommand(-170,-100, driver));
        command.addCommand(new OperateToCommand(100,-100, driver));
        return command;
    }

    public static DriverCommand pentagonCommand(Job2dDriver driver){
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(100, -100, driver));
        command.addCommand(new OperateToCommand(100,0, driver));
        command.addCommand(new OperateToCommand(0, 100, driver));
        command.addCommand(new OperateToCommand(-100,0, driver));
        command.addCommand(new OperateToCommand(-100,-100, driver));
        command.addCommand(new OperateToCommand(100,-100, driver));
        return command;
    }
}
