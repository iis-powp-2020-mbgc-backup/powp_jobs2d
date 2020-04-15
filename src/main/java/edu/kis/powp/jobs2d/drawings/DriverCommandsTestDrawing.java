package edu.kis.powp.jobs2d.drawings;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

public class DriverCommandsTestDrawing {

    public static void figureScript(Job2dDriver driver){
        DriverCommand command = new SetPositionCommand(200, 50);
        command.execute(driver);
        command = new OperateToCommand( -100,-200);
        command.execute(driver);
        command = new OperateToCommand( -100,0);
        command.execute(driver);
        command = new OperateToCommand( 50,0);
        command.execute(driver);
    }
}
