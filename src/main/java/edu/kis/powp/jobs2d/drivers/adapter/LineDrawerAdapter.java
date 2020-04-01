package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
    private int startX = 0, startY = 0;
    private ILine iLine;

    public LineDrawerAdapter(ILine iLine) {
        super();
        this.iLine = iLine;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startY = y;
        this.startX = x;
    }

    @Override
    public void operateTo(int x, int y) {
        iLine.setEndCoordinates(x, y);
        iLine.setStartCoordinates(this.startX, this.startY);
        DrawerFeature.getDrawerController().drawLine(iLine);
        setPosition(x,y);
    }

    @Override
    public String toString() {
        return "Line Drawer Adapter";
    }
}