package edu.kis.powp.jobs2d.shapes.scripts.basic;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.shapes.Point;

import java.util.ArrayList;
import java.util.Arrays;

public class CircularPolygon implements Shape {

    public final static CircularPolygon DEFAULT;
    private final static int DEFAULT_RADIUS = 1;
    private final static Point DEFAULT_CENTER = Point.ZERO;
    private final static ArrayList<Point> DEFAULT_POINTS;

    static {
        DEFAULT_POINTS = new ArrayList<>(Arrays.asList(Point.X_UNIT, Point.Y_UNIT, Point.N_X_UNIT, Point.N_Y_UNIT));
        DEFAULT = new CircularPolygon();
        DEFAULT.center = DEFAULT_CENTER;
        DEFAULT.radius = DEFAULT_RADIUS;
        DEFAULT.vertices = DEFAULT_POINTS;
    }

    private ArrayList<Point> vertices = new ArrayList<>();
    private Point center;
    private int radius;

    private CircularPolygon() {

    }

    @Override
    public DriverCommand script() {
        ComplexCommand.ComplexCommandBuilder builder = ComplexCommand.builder();

        builder = builder.addCommand(new SetPositionCommand(vertices.get(0).getX(), vertices.get(0).getY()));

        for (int i = 1; i < vertices.size(); ++i) {
            Point p = vertices.get(i);
            builder = builder.addCommand(new OperateToCommand(p.getX(), p.getY()));
        }

        return builder.addCommand(new OperateToCommand(vertices.get(0).getX(), vertices.get(0).getY())).build();
    }

    private CircularPolygon(CircularPolygonBuilder builder){
        if (builder.radius <= 0 ) throw new IllegalArgumentException();
        this.radius = builder.radius;
        this.center = builder.center;
        this.vertices = computeVertices();
    }

    private ArrayList<Point> computeVertices() {
        ArrayList<Point> outputList = new ArrayList<>();

        outputList.add(new Point(radius + center.getX(), center.getY()));
        outputList.add(new Point(-radius + center.getX(), center.getY()));
        outputList.add(new Point(center.getX(), radius + center.getY()));
        outputList.add(new Point(center.getX(), -radius + center.getY()));

        for(int x = 1; x < radius; ++x){
            int ySq = radius * radius - x*x;
            int y = (int)Math.sqrt(ySq);
            if(y*y == ySq){
                outputList.add(new Point(x + center.getX(), y + center.getY()));
                outputList.add(new Point(x + center.getX(), -y + center.getY()));
                outputList.add(new Point(-x + center.getX(), y + center.getY()));
                outputList.add(new Point(-x + center.getX(), -y + center.getY()));
            }
        }

        outputList.sort(this::counterClockwisePointsComparatorBasedOnQuadrantsComputation);

        return outputList;

    }

    public static CircularPolygonBuilder builder(){
        return new CircularPolygonBuilder();
    }

    public final static class CircularPolygonBuilder implements ShapeBuilder{
        private int radius;
        private Point center;

        private CircularPolygonBuilder(){

        }

        public CircularPolygonBuilder ofRadius(int radius){
            this.radius = radius;
            return this;
        }

        public CircularPolygonBuilder havingCenterThere(Point center){
            this.center = center;
            return this;
        }

        @Override
        public CircularPolygon build(){
            return new CircularPolygon(this);
        }

    }

    private static int computeQuadrant(Point center, Point p){
        int dpx,dpy,q;
        dpx = ((p.getX() - center.getX()) > 0) ? 1 : 0;
        dpy = ((p.getY() - center.getY()) > 0) ? 1 : 0;
        q = (1 - dpx) + (1 - dpy) + ((dpx & (1 - dpy)) << 1);
        return q;
    }

    private int counterClockwisePointsComparatorBasedOnQuadrantsComputation(Point a, Point b) {
        int qa = computeQuadrant(center, a);
        int qb = computeQuadrant(center, b);
        if (qa == qb) {
            return (b.getY() - center.getY()) * (a.getX() - center.getX()) - (b.getX() - center.getX()) * (a.getY() - center.getY());
        } else {
            return qb - qa;
        }
    }
}
