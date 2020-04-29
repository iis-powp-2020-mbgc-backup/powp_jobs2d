package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class FigureCommand {
    public static void figureScript(Job2dDriver driver) {
        new SetPositionCommand(0, 0, driver).execute();
        new OperateToCommand(50, 40, driver ).execute();
        new OperateToCommand(20, -50, driver).execute();
        new OperateToCommand(10, 10, driver).execute();
    }
}
