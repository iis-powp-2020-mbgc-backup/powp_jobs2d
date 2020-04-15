package edu.kis.powp.jobs2d.factiories;

import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.features.FigureToDraw;
import edu.kis.powp.jobs2d.shapes.scripts.basic.CircularPolygon;
import edu.kis.powp.jobs2d.shapes.scripts.basic.Rectangle;
import edu.kis.powp.jobs2d.shapes.scripts.basic.Triangle;
import edu.kis.powp.jobs2d.shapes.scripts.complex.FiguresJane;
import edu.kis.powp.jobs2d.shapes.scripts.complex.FiguresJoe;

public final class FiguresFactory {

    public static DriverCommand of(FigureToDraw type) {
        DriverCommand figure = null;

        switch (type) {

            case JOE_FIGURE_1:
                figure = figureJoe1();
                break;
            case JOE_FIGURE_2:
                figure = figureJoe2();
                break;
            case JANE_FIGURE:
                figure = figureJane();
                break;
            case CIRCULAR_POLYGON:
                figure = defaultCircularPolygon();
                break;
            case RECTANGLE:
                figure = defaultRectangle();
                break;
            case TRIANGLE:
                figure = defaultTriangle();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

        return figure;
    }

    private static DriverCommand defaultRectangle() {
        return Rectangle.DEFAULT.script();
    }

    private static DriverCommand defaultTriangle() {
        return Triangle.DEFAULT.script();
    }

    private static DriverCommand defaultCircularPolygon() {
        return CircularPolygon.DEFAULT.script();
    }

    private static DriverCommand figureJoe1() {
        return FiguresJoe.first();
    }

    private static DriverCommand figureJoe2() {
        return FiguresJoe.second();
    }

    private static DriverCommand figureJane() {
        return FiguresJane.script();
    }
}
