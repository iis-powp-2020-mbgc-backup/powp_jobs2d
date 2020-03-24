package edu.kis.powp.jobs2d.drivers.adapter;


import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {

    private DrawPanelController controller;
    private int x = 0;
    private int y = 0;
    private ILine lineToDraw = null;

    public LineDrawerAdapter(DrawPanelController controller, ILine lineToDraw) {
        this.controller = controller;
        this.lineToDraw = lineToDraw;
    }

    public LineDrawerAdapter(DrawPanelController controller, LineType type){
        this.controller = controller;
        switch(type){

            case BASIC:
                this.lineToDraw = LineFactory.getBasicLine();
            case DOTTED:
                this.lineToDraw = LineFactory.getDottedLine();
                break;
            case SPECIAL:
                this.lineToDraw = LineFactory.getSpecialLine();
                break;
            default:
                throw new IllegalArgumentException("Wrong type of line: " + type.name());
        }
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

    @Override
    public String toString() {
        return "Line drawer adapter";
    }

}
