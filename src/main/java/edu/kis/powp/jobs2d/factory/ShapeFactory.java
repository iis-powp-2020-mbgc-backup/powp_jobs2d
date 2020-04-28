package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class ShapeFactory {

    public static DriverCommand square(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(0, 0, driver));
        command.addCommand(new OperateToCommand(0, 60, driver));
        command.addCommand(new OperateToCommand(60, 60, driver));
        command.addCommand(new OperateToCommand(60, 0, driver));
        command.addCommand(new OperateToCommand(0, 0, driver));

        command.execute();
        return command;
    }

    public static DriverCommand triangle(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(-40, 0, driver));
        command.addCommand(new OperateToCommand(40, 0, driver));
        command.addCommand(new OperateToCommand(0, 40, driver));
        command.addCommand(new OperateToCommand(-40, 0, driver));

        command.execute();
        return command;
    }

    public static DriverCommand rectangle(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(0, 0, driver));
        command.addCommand(new OperateToCommand(0, 60, driver));
        command.addCommand(new OperateToCommand(30, 60, driver));
        command.addCommand(new OperateToCommand(30, 0, driver));
        command.addCommand(new OperateToCommand(0, 0, driver));

        command.execute();
        return command;
    }
}
