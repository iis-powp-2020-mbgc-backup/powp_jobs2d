package edu.kis.powp.jobs2d.drivers.commands.shapes;

import edu.kis.powp.jobs2d.drivers.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.commands.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.commands.SetPositionCommand;

public class RectangleComplexCommand extends ComplexCommand {
    RectangleComplexCommand(int a, int b, int offset_x, int offset_y) {
        addComannd(new SetPositionCommand(offset_x, offset_y));
        addComannd(new OperateToCommand(a + offset_x, offset_y));
        addComannd(new OperateToCommand(a + offset_x, b + offset_y));
        addComannd(new OperateToCommand(offset_x, b + offset_y));
        addComannd(new OperateToCommand(offset_x, offset_y));
    }
}
