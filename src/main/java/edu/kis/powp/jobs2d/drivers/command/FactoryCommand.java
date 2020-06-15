package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class FactoryCommand {

    public static ComplexCommand makeT(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driver, -150 , -80));
        command.addCommand(new OperateToCommand(driver,-150, -130));
        command.addCommand(new OperateToCommand(driver,150, -130));
        command.addCommand(new OperateToCommand(driver,150, -80));
        command.addCommand(new OperateToCommand(driver,30, -80));
        command.addCommand(new OperateToCommand(driver,30, 170));
        command.addCommand(new OperateToCommand(driver,-30, 170));
        command.addCommand(new OperateToCommand(driver,-30, -80));
        command.addCommand(new OperateToCommand(driver,-150, -80));

        return command;
    }

    public static ComplexCommand makeA(Job2dDriver driver) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driver,-150, 170));
        command.addCommand(new OperateToCommand(driver,-40, -130));
        command.addCommand(new OperateToCommand(driver,40, 170));
        command.addCommand(new SetPositionCommand(driver,-115, 80));
        command.addCommand(new OperateToCommand(driver,15, 80));



        return command;
    }
}
