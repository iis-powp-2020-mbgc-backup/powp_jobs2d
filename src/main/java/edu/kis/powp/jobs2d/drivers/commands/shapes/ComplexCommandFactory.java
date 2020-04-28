package edu.kis.powp.jobs2d.drivers.commands.shapes;

import edu.kis.powp.jobs2d.drivers.commands.ComplexCommand;

public class ComplexCommandFactory {
    public static ComplexCommand getRectangleComplexCommand(int a, int b, int offset_x, int offset_y) {
        return new RectangleComplexCommand(a, b, offset_x, offset_y);
    }

    public static ComplexCommand getRhombusComplexCommand(int d, int offset_x, int offset_y) {
        return new RhombusComplexCommand(d, offset_x, offset_y);
    }
}
