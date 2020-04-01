package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
    ILine selectedLineType;

    private int startX = 0, startY = 0;
    private DrawPanelController drawPanelController = DrawerFeature.getDrawerController();

    public LineDrawerAdapter() {
        super();
        setSelectedLineType(LineFactory.getBasicLine());
    }

    public LineDrawerAdapter(ILine lineType) {
        super();
        setSelectedLineType(lineType);
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        selectedLineType.setStartCoordinates(this.startX, this.startY);
        selectedLineType.setEndCoordinates(x, y);
        setPosition(x, y);

        drawPanelController.drawLine(selectedLineType);
    }

    public void setSelectedLineType(ILine selectedLineType) {
        this.selectedLineType = selectedLineType;
    }
}
