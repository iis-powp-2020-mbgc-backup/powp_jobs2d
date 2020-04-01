package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {

    private DrawPanelController drawPanelController;
    private ILine line;
    private int startX = 0;
    private int startY = 0;

    public LineDrawerAdapter(DrawPanelController drawPanelController, LineTypeEnum lineTypeEnum) {

        this.drawPanelController = drawPanelController;

        switch (lineTypeEnum) {
            case BASIC:
                this.line = LineFactory.getBasicLine();
                break;
            case DOTTED:
                this.line = LineFactory.getDottedLine();
                break;
            case SPECIAL:
                this.line = LineFactory.getSpecialLine();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        this.line.setStartCoordinates(this.startX, this.startY);
        this.line.setEndCoordinates(x, y);
        setPosition(x, y);
        this.drawPanelController.drawLine(this.line);
    }

    @Override
    public String toString() {
        return "Line Drawer";
    }
}