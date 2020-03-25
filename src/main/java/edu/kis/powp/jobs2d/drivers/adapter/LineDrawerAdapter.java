package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
    private int startX = 0, startY = 0;
    private DrawPanelController drawController;
    private ILine line;
    public LineDrawerAdapter(ILine prefferedLine) {
        super();
        drawController = DrawerFeature.getDrawerController();
        line = prefferedLine;
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
        this.startX = x;
        this.startY = y;
        drawController.drawLine(line);
    }

    @Override
    public String toString() {
        return "Line Drawer";
    }
}
