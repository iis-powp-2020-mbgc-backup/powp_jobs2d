package edu.kis.powp.jobs2d.drivers.adapter;


import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * Driver Adapter for line drawing
 */
public class LineDrawerAdapter implements Job2dDriver {

    private DrawPanelController controller;
    private int x = 0;
    private int y = 0;
    private ILine lineToDraw = null;

    public LineDrawerAdapter(DrawPanelController controller, ILine lineToDraw) {
        this.controller = controller;
        this.lineToDraw = lineToDraw;
    }

    @Override
    public void setPosition(int toX, int toY) {
        this.x = toX;
        this.y = toY;
    }

    @Override
    public void operateTo(int destX, int destY) {
        this.lineToDraw.setStartCoordinates(this.x, this.y);
        this.lineToDraw.setEndCoordinates(destX, destY);

        this.controller.drawLine(this.lineToDraw);
        setPosition(destX, destY);
    }
}
