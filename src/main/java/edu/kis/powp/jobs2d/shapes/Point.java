package edu.kis.powp.jobs2d.shapes;

public class Point {

    public final static Point ZERO = new Point();
    public final static Point X_UNIT;
    public final static Point Y_UNIT;
    public final static Point N_X_UNIT;
    public final static Point N_Y_UNIT;

    static {
        X_UNIT = new Point(1,0);
        Y_UNIT = new Point(0,1);
        N_X_UNIT = new Point(-1, 0);
        N_Y_UNIT = new Point(0, -1);
    }

    private int X = 0;
    private int Y = 0;

    private Point(){

    }

    public Point(int x, int y){
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
