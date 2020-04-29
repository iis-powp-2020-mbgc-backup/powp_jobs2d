package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class TriangleComplexCommandFactory implements ComplexCommandFactory {

    public TriangleComplexCommandFactory() {};

    @Override
    public  ComplexCommand getComplexCommand(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(job2dDriver, 90, 30));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, 40, -70));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, -40, -70));
        complexCommand.addCommand(new OperateToCommand(job2dDriver, 90, 30));

        return complexCommand;
    }
}
