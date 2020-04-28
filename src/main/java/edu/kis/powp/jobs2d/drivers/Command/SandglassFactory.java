package edu.kis.powp.jobs2d.drivers.Command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SandglassFactory {

    ComplexCommand command;

    public void run(Job2dDriver job2dDriver){
        command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(-120, -120));
        command.addCommand(new OperateToCommand(120, 120));
        command.addCommand(new OperateToCommand(-120, 120));
        command.addCommand(new OperateToCommand(120, -120));
        command.addCommand(new OperateToCommand(-120, -120));
        command.execute(job2dDriver);
    }

}
