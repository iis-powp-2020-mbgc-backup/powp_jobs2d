package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class FigureCommand {
    public static void figureScript(Job2dDriver job2dDriver) {
        new SetPositionCommand(job2dDriver, 0, 0).execute();
        new OperateToCommand(job2dDriver, 40, -70).execute();
        new OperateToCommand(job2dDriver, -40, -70).execute();
        new OperateToCommand(job2dDriver, 0, 0).execute();
    }
}
