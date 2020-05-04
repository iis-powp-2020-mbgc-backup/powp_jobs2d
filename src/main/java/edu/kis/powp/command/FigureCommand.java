package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class FigureCommand {
    public static void figureScript(Job2dDriver driver) {
        new SetPositionCommand(0, 0, driver).execute();
        new OperateToCommand(50, 40, driver ).execute();
        new OperateToCommand(20, -50, driver).execute();
        new OperateToCommand(10, 10, driver).execute();
    }
    public static void complexCommandSquareScript(Job2dDriver job2dDriver) {
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(-40, -30,job2dDriver));
        list.add(new OperateToCommand(40, -30,job2dDriver));
        list.add(new OperateToCommand(0, 40,job2dDriver));
        list.add(new OperateToCommand(-40, -30,job2dDriver));

        new ComplexCommand(list).execute();
    }
}
