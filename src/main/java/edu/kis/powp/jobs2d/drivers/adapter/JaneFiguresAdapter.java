package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.job2d.custom.CustomLine;
import edu.kis.powp.jobs2d.AbstractDriver;

public class JaneFiguresAdapter extends AbstractDriver {

    private ILine line;
    private DrawPanelController drawPanelController;

    public JaneFiguresAdapter(int x, int y, DrawPanelController drawPanelController) {
        super(x, y);
        this.drawPanelController = drawPanelController;
        line = LineFactory.getBasicLine();
    }

    public JaneFiguresAdapter(int x, int y, DrawPanelController drawPanelController, CustomLine line) {
        super(x, y);
        this.drawPanelController = drawPanelController;
        this.line = line;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(x, y);

        this.setPosition(x, y);

        drawPanelController.drawLine(line);
    }

}
