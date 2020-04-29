package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class RhombusComplexCommandFactory implements ComplexCommandFactory {

    public RhombusComplexCommandFactory() {};

    @Override
    public ComplexCommand getComplexCommand(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(job2dDriver, -20, 20));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, 60, 20));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, 40, -20));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, -40, -20));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, -20, 20));

        return complexCommand;
    }
}
