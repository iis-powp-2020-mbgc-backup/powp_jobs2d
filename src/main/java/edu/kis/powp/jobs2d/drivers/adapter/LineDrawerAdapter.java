package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {

    private ILine lineType = null;
    private DrawPanelController dpc = null;
    private int startX = 0, startY = 0;

    public LineDrawerAdapter(DrawPanelController drawPanelController, ILine lineType) {
        this.lineType = lineType;
        this.dpc = drawPanelController;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = lineType;
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        setPosition(x, y);
        dpc.drawLine(line);
    }
    @Override
    public String toString() {
        return "LineDrawerAdapter " + lineType.getClass().getSimpleName();
    }
}
