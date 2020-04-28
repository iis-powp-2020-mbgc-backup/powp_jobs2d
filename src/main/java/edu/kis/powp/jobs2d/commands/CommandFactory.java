package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {

    public static ComplexCommand createSquare(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driver).setY(10).setX(-10));
        command.addCommand(new OperateToCommand(driver).setY(10).setX(10));
        command.addCommand(new OperateToCommand(driver).setY(-10).setX(10));
        command.addCommand(new OperateToCommand(driver).setY(-10).setX(-10));
        command.addCommand(new OperateToCommand(driver).setY(10).setX(-10));

        return command;
    }

    public static ComplexCommand createRectangle(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driver).setY(10).setX(-20));
        command.addCommand(new OperateToCommand(driver).setY(10).setX(20));
        command.addCommand(new OperateToCommand(driver).setY(-10).setX(20));
        command.addCommand(new OperateToCommand(driver).setY(-10).setX(-20));
        command.addCommand(new OperateToCommand(driver).setY(10).setX(-20));

        return command;
    }

}
