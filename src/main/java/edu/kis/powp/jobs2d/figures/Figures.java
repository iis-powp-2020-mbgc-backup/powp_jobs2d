package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.Command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.Command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.Command.SetPositionCommand;

public class Figures {
    public static void figureScript1(Job2dDriver job2dDriver) {
        new SetPositionCommand(0, 0, job2dDriver).execute();
        new OperateToCommand(0, 50, job2dDriver).execute();
        new OperateToCommand(100, 50, job2dDriver).execute();
        new OperateToCommand(100, 0, job2dDriver).execute();
        new OperateToCommand(0, 0, job2dDriver).execute();
    }

    public static void figureScript2(Job2dDriver job2dDriver) {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 0, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0, 50, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(50, 50, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(50, 0, job2dDriver));
        complexCommand.addCommand(new OperateToCommand(0, 0, job2dDriver));

        complexCommand.execute();
    }
}
