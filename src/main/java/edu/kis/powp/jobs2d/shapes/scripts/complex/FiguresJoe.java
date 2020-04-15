package edu.kis.powp.jobs2d.shapes.scripts.complex;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public final class FiguresJoe {

    public static DriverCommand first() {
        return ComplexCommand.builder()
                             .addCommand(new SetPositionCommand(-120, -120))
                             .addCommand(new OperateToCommand(120, -120))
                             .addCommand(new OperateToCommand(120, 120))
                             .addCommand(new OperateToCommand(-120, 120))
                             .addCommand(new OperateToCommand(-120, -120))
                             .addCommand(new OperateToCommand(120, 120))
                             .addCommand(new SetPositionCommand(120, -120))
                             .addCommand(new OperateToCommand(-120, 120))
                             .build();
    }

    public static DriverCommand second() {
        return ComplexCommand.builder()
                             .addCommand(new SetPositionCommand(0, 0))
                             .addCommand(new OperateToCommand(233, -33))
                             .addCommand(new OperateToCommand(24, 90))
                             .addCommand(new OperateToCommand(-104, 80))
                             .addCommand(new OperateToCommand(11, -22))
                             .addCommand(new OperateToCommand(-33, 44))
                             .addCommand(new OperateToCommand(-66, -88))
                             .addCommand(new OperateToCommand(128, 256))
                             .build();
    }

}
