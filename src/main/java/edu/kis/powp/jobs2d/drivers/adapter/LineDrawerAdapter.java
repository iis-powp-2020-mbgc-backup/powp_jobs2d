package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0;
    private int startY = 0;
    private ILine line;
    private DrawPanelController drawPanelController;

    public LineDrawerAdapter(ILine line, DrawPanelController drawPanelController) {
        super();
        this.line = line;
        this.drawPanelController=drawPanelController;
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

        setPosition(x, y);
        this.drawPanelController.drawLine(line);
    }

    @Override
    public String toString() {
        return "LineDrawerAdapter";
    }
}