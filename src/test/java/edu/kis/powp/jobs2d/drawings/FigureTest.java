package edu.kis.powp.jobs2d.drawings;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.adapter.SetPositionCommand;

public class FigureTest {
    public FigureTest() {

    }

    public static void figureScript(Job2dDriver driver) {
        new SetPositionCommand(80, 80).execute(driver);
        new OperateToCommand(80, -80).execute(driver);
        new OperateToCommand(-80, -80).execute(driver);
        new OperateToCommand(-80, 80).execute(driver);
        new OperateToCommand(0, 0).execute(driver);
    }
}

