package edu.kis.powp.jobs2d.drawings;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.adapter.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.adapter.SetPositionCommand;

public class FiguresTest {
    public FiguresTest() {

    }

    public static void figureScript(Job2dDriver driver) {
        new SetPositionCommand(80, 80).execute(driver);
        new OperateToCommand(80, -80).execute(driver);
        new OperateToCommand(-80, -80).execute(driver);
        new OperateToCommand(-80, 80).execute(driver);
        new OperateToCommand(0, 0).execute(driver);
    }

    public static void figureScript2(Job2dDriver driver) {
        ComplexCommand commandCascade = new ComplexCommand();

        commandCascade.addCommand(new SetPositionCommand(0, 80));
        commandCascade.addCommand(new OperateToCommand(80, 80));
        commandCascade.addCommand(new OperateToCommand(80, 0));
        commandCascade.addCommand(new OperateToCommand(0, 0));

        commandCascade.execute(driver);
    }
}

