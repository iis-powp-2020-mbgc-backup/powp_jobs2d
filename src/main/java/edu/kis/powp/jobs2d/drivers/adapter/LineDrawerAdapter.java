package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0;
    private int startY = 0;
    private ILine iLine;
    private DrawPanelController drawPanelController;

    public LineDrawerAdapter(DrawPanelController drawPanelController, ILine line) {
        this.drawPanelController = drawPanelController;
        this.iLine = line;
    }

    @Override
    public String toString() {
        return "Line Drawer Simulator";
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        iLine.setStartCoordinates(this.startX, this.startY);
        iLine.setEndCoordinates(x, y);
        setPosition(x, y);
        drawPanelController.drawLine(iLine);
    }

}
