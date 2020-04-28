package edu.kis.powp.jobs2d.drivers.commands.shapes;

import edu.kis.powp.jobs2d.drivers.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.commands.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.commands.SetPositionCommand;

public class RhombusComplexCommand extends ComplexCommand {
    RhombusComplexCommand(int d, int offset_x, int offset_y) {
        addComannd(new SetPositionCommand(d / 2 + offset_x, offset_y));
        addComannd(new OperateToCommand(d + offset_x, d / 2 + offset_y));
        addComannd(new OperateToCommand(d / 2 + offset_x, d + offset_y));
        addComannd(new OperateToCommand(offset_x, d / 2 + offset_y));
        addComannd(new OperateToCommand(d / 2 + offset_x, offset_y));
    }
}
