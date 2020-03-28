package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

import javax.swing.*;

/**
 * driver adapter to drawer with several bugs.
 */
public class Job2dDriverAdapter implements Job2dDriver {

	private final ILine lineToDraw;
	private int startX = 0, startY = 0;
    private DrawPanelController drawPanelController;

    public Job2dDriverAdapter(DrawPanelController drawPanelController, ILine lineToDraw) {
        this.drawPanelController = drawPanelController;
        this.lineToDraw = lineToDraw;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        this.lineToDraw.setStartCoordinates(this.startX, this.startY);
        this.lineToDraw.setEndCoordinates(x, y);

        drawPanelController.drawLine(this.lineToDraw);
        this.setPosition(x, y);
    }

    @Override
    public String toString() {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
}
