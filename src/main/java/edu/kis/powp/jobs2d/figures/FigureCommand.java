package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.adapter.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.adapter.SetPositionCommand;

public class FigureCommand {
    public static void figureScript(Job2dDriver job2dDriver) {
        new SetPositionCommand(0, 0).execute(job2dDriver);
        new OperateToCommand(0, 50).execute(job2dDriver);
        new OperateToCommand(50, 50).execute(job2dDriver);
        new OperateToCommand(50, 0).execute(job2dDriver);
        new OperateToCommand(0, 0).execute(job2dDriver);
    }

    public static void figureScript2(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 0));

        complexCommand.addCommand(new OperateToCommand(0, 50));
        complexCommand.addCommand(new OperateToCommand(50, 50));
        complexCommand.addCommand(new OperateToCommand(50, 0));
        complexCommand.addCommand(new OperateToCommand(0, 0));

        complexCommand.execute(job2dDriver);
    }
}
