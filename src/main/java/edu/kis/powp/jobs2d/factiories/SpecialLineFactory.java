package edu.kis.powp.jobs2d.factiories;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.drivers.adapter.LineType;
import edu.kis.powp.jobs2d.shapes.lines.UserModifiableLine;

public final class SpecialLineFactory {

    private static ILine getBasicLine() {
        return LineFactory.getBasicLine();
    }

    private static ILine getDottedLine() {
        return LineFactory.getBasicLine();
    }

    private static ILine getSpecialLine() {
        return LineFactory.getSpecialLine();
    }

    private static ILine getUserModifiableLine() {
        return new UserModifiableLine();
    }

    public static ILine of(LineType type){

        ILine lineToDraw  = null;


        switch (type) {

            case BASIC:
                lineToDraw = SpecialLineFactory.getBasicLine();
                break;
            case DOTTED:
                lineToDraw = SpecialLineFactory.getDottedLine();
                break;
            case SPECIAL:
                lineToDraw = SpecialLineFactory.getSpecialLine();
                break;
            case WITH_OPTIONS:
                lineToDraw = SpecialLineFactory.getUserModifiableLine();
                break;
            default:
                throw new IllegalArgumentException("Wrong type of line: " + type.name());
        }

        return lineToDraw;
    }
}
