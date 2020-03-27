package edu.kis.powp.jobs2d.factiories;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.shapes.lines.UserModifiableLine;

public final class SpecialLineFactory {

    public static ILine getBasicLine(){
        return LineFactory.getBasicLine();
    }

    public static ILine getDottedLine(){
        return LineFactory.getBasicLine();
    }

    public static ILine getSpecialLine(){
        return LineFactory.getSpecialLine();
    }

    public static ILine getUserModifiableLine(){
        return new UserModifiableLine();
    }
}
