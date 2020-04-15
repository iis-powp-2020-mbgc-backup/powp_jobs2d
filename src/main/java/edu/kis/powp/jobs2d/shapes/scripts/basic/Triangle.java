package edu.kis.powp.jobs2d.shapes.scripts.basic;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.shapes.Point;

public class Triangle implements Shape {

    private final static Point DEFAULT_A = Point.ZERO;
    private final static Point DEFAULT_B = Point.X_UNIT;
    private final static Point DEFAULT_C = Point.Y_UNIT;

    public final static Triangle DEFAULT;

    static {
        DEFAULT = new Triangle();
        DEFAULT.a = DEFAULT_A;
        DEFAULT.b = DEFAULT_B;
        DEFAULT.c = DEFAULT_C;
    }

    private Point a = Point.ZERO;
    private Point b = Point.X_UNIT;
    private Point c = Point.Y_UNIT;

    private Triangle(TriangleBuilder triangleBuilder) {
        if(!verticesRule(triangleBuilder)) throw new IllegalArgumentException();
        this.a = triangleBuilder.a;
        this.b = triangleBuilder.b;
        this.c = triangleBuilder.c;
    }

    @Override
    public DriverCommand script() {
        return ComplexCommand.builder()
                             .addCommand(new SetPositionCommand(a.getX(), a.getY()))
                             .addCommand(new OperateToCommand(b.getX(), b.getY()))
                             .addCommand(new OperateToCommand(c.getX(), c.getY()))
                             .addCommand(new OperateToCommand(a.getX(), a.getY()))
                             .build();
    }

    private Triangle() {

    }

    private static boolean verticesRule(TriangleBuilder builder){
        Point a = builder.a;
        Point b = builder.b;
        Point c = builder.c;
        double result = 0.5 * ((a.getX() - b.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - b.getY()));
        return result != 0;
    }

    public static TriangleBuilder builder() {
        return new TriangleBuilder();
    }

    public final static class TriangleBuilder implements ShapeBuilder{

        private Point a = Point.ZERO;
        private Point b = Point.X_UNIT;
        private Point c = Point.Y_UNIT;

        public TriangleBuilder havingVertexA(Point p) {
            a = p;
            return this;
        }

        public TriangleBuilder havingVertexB(Point p) {
            b = p;
            return this;
        }

        public TriangleBuilder havingVertexC(Point p) {
            c = p;
            return this;
        }

        @Override
        public Triangle build() {
            return new Triangle(this);
        }

        private TriangleBuilder(){

        }
    }
}
