package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawerFeature implements Job2dDriver {
    private int startX, startY;
    private ILine line;

    public LineDrawerAdapter(ILine line) {
        this.line = line;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        getDrawerController().drawLine(line);
        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "LineDrawerAdapter";
    }
}
