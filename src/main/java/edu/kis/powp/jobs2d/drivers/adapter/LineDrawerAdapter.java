package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;


public class LineDrawerAdapter extends DrawerFeature implements Job2dDriver {
    private int startX = 0, startY = 0;
    private ILine line;

    public LineDrawerAdapter() {
        super();
        this.line = LineFactory.getDottedLine();
    }


    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        this.line.setStartCoordinates(this.startX, this.startY);
        this.line.setEndCoordinates(x, y);
        setPosition(x, y);

        getDrawerController().drawLine(line);
    }

    @Override
    public String toString() {
        return "Line drawer adapter";
    }

}
