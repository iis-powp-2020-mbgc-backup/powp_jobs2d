package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.*;

public class RectangleFactory {

    ComplexCommand command;

    public void run(Job2dDriver job2dDriver){
        command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(-120, -120));
        command.addCommand(new OperateToCommand(-120, 120));
        command.addCommand(new OperateToCommand(0, 120));
        command.addCommand(new OperateToCommand(0, -120));
        command.addCommand(new OperateToCommand(-120, -120));
        command.executeCommand(job2dDriver);
    }

}