package edu.kis.powp.jobs2d.shapes.scripts.basic;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;
import edu.kis.powp.jobs2d.shapes.Point;

public class Rectangle implements Shape{

    private final static int DEFAULT_WIDTH = 10;
    private final static int DEFAULT_HEIGHT = 5;

    public final static Rectangle DEFAULT;

    static {
        DEFAULT = new Rectangle();
        DEFAULT.height = DEFAULT_HEIGHT;
        DEFAULT.width = DEFAULT_WIDTH;
        DEFAULT.leftCorner = Point.ZERO;
    }

    private int width = 0;
    private int height = 0;
    private Point leftCorner = Point.ZERO;

    private Rectangle(RectangleBuilder rectangleBuilder) {
        this.width = rectangleBuilder.width;
        this.height = rectangleBuilder.height;
        this.leftCorner = rectangleBuilder.leftCorner;
    }

    @Override
    public DriverCommand script() {
        return ComplexCommand.builder()
                             .addCommand(new SetPositionCommand(leftCorner.getX(), leftCorner.getY()))
                             .addCommand(new OperateToCommand(leftCorner.getX(), height))
                             .addCommand(new OperateToCommand(width, height))
                             .addCommand(new OperateToCommand(width, leftCorner.getY()))
                             .addCommand(new OperateToCommand(leftCorner.getX(), leftCorner.getY()))
                             .build();
    }

    private Rectangle() {

    }

    public static RectangleBuilder builder(){
        return new RectangleBuilder();
    }

    public final static class RectangleBuilder{

        private int width = DEFAULT_WIDTH;
        private int height = DEFAULT_HEIGHT;
        private Point leftCorner = Point.ZERO;

        public RectangleBuilder ofWidth(int width){
            if(width <= 0) throw new IllegalArgumentException();
            this.width = width;
            return this;
        }

        public RectangleBuilder ofHeight(int height){
            if (height <= 0) throw new IllegalArgumentException();
            this.height = height;
            return this;
        }

        public RectangleBuilder havingLeftTopCorner(Point p){
            leftCorner = p;
            return this;
        }

        public Rectangle build(){
            return new Rectangle(this);
        }

        private RectangleBuilder(){

        }
    }
}
