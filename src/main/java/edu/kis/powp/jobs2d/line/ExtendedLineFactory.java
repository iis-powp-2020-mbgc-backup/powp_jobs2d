package edu.kis.powp.jobs2d.line;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

import java.awt.*;

public class ExtendedLineFactory extends LineFactory {
    public ExtendedLineFactory() {}

    public static ILine getModifiableLine(Color color, float thickness, boolean dotted) { return new ModifiableLine(color, thickness, dotted); }

    public static ILine getModifiableLine(ModifiableLine modifiableLine) { return new ModifiableLine(modifiableLine); }

    public static ILine getModifiableLine() { return new ModifiableLine(); }
}
