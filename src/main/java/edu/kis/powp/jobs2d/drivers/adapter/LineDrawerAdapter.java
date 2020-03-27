package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter implements Job2dDriver {

    private ILine line;
    private int x, y;
    private DrawPanelController controller;

    public LineDrawerAdapter(DrawPanelController controller, ILine line) {
        this.line = line;
        this.controller = controller;
    }

    @Override
    public void setPosition(int i, int i1) {
        this.x = i;
        this.y = i1;
    }

    @Override
    public void operateTo(int i, int i1) {
        line.setStartCoordinates(this.x, this.y);
        line.setEndCoordinates(i, i1);
        setPosition(i, i1);
        this.controller.drawLine(this.line);
    }
}
