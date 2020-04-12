package edu.kis.powp.jobs2d.line;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.line.BasicLine;

public class LineFactoryExtended {
    public static ILine getEditAbleLine() {
        return new EditableLine();
    }
}
