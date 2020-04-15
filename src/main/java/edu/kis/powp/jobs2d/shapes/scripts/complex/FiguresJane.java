package edu.kis.powp.jobs2d.shapes.scripts.complex;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public final class FiguresJane {

    public static DriverCommand script() {
        return ComplexCommand.builder()
                             .addCommand(new SetPositionCommand(80, 80))
                             .addCommand(new OperateToCommand(-80, -80))
                             .addCommand(new OperateToCommand(80, -80))
                             .addCommand(new OperateToCommand(80, 80))
                             .addCommand(new OperateToCommand(-80, 80))
                             .addCommand(new OperateToCommand(-80, -80))
                             .addCommand(new OperateToCommand(0, -160))
                             .addCommand(new OperateToCommand(80, -80))
                             .addCommand(new OperateToCommand(-80, 80))
                             .build();
    }
}
