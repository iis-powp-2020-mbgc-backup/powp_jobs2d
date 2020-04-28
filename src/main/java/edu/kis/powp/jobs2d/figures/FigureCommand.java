package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class FigureCommand {
    public static void figureScript(Job2dDriver job2dDriver) {
        new SetPositionCommand(job2dDriver, 0, 0).execute();
        new OperateToCommand(job2dDriver, 40, -70).execute();
        new OperateToCommand(job2dDriver, -40, -70).execute();
        new OperateToCommand(job2dDriver, 0, 0).execute();
    }

    public static void figureScriptCommand(Job2dDriver job2dDriver) {
        List<DriverCommand> list = new ArrayList<>();

        list.add(new SetPositionCommand(job2dDriver, -40, 20));
        list.add(new OperateToCommand(job2dDriver, 40, 20));
        list.add(new OperateToCommand(job2dDriver, 40, -20));
        list.add(new OperateToCommand(job2dDriver, -40, -20));
        list.add(new OperateToCommand(job2dDriver, -40, 20));

        new ComplexCommand(list).execute();
    }
}
