package edu.kis.powp.jobs2d.drivers.adapter;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * Driver Adapter for drawing lines
 */

public class LineDrawerAdapter implements Job2dDriver {

    private DrawPanelController mainController;
    private ILine lineToDraw;
    private int x = 0;
    private int y = 0;

    public LineDrawerAdapter(DrawPanelController controller, LineType lineType)
    {
        this.mainController = controller;

        switch(lineType)
        {
            case SOLID:
                this.lineToDraw = LineFactory.getBasicLine();
                break;
            case SPECIAL:
                this.lineToDraw = LineFactory.getSpecialLine();
                break;
            case DOTTED:
                this.lineToDraw = LineFactory.getDottedLine();
                break;
            default:
                throw new IllegalArgumentException("Wrong line type: " + lineType.name());
        }
    }

    @Override
    public void setPosition(int toX, int toY)
    {
        this.x = toX;
        this.y = toY;
    }

    @Override
    public void operateTo(int destX, int destY)
    {
        this.lineToDraw.setStartCoordinates(this.x, this.y);
        this.lineToDraw.setEndCoordinates(destX, destY);

        this.mainController.drawLine(this.lineToDraw);
        setPosition(destX, destY);
    }

    @Override
    public String toString()
    {
        return "LineDrawerAdapter";
    }
}