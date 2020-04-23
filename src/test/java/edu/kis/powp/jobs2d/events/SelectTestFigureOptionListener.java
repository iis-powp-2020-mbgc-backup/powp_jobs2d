package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;
    private Figure figureToDraw;
    private ComplexCommandFactory complexCommandFactory;
    private int circleRadius;

    public SelectTestFigureOptionListener(DriverManager driverManager, Figure figure) {
        this(driverManager, figure, 0);
    }

    public SelectTestFigureOptionListener(DriverManager driverManager, Figure figure, int radius) {
        this.driverManager = driverManager;
        this.figureToDraw = figure;
        this.circleRadius = radius;
        complexCommandFactory = new ComplexCommandFactory();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (figureToDraw) {
        case FIGURE_JOE_1:
            FiguresJoe.figureScript1(driverManager.getCurrentDriver());
            break;
        case FIGURE_JOE_2:
            FiguresJoe.figureScript2(driverManager.getCurrentDriver());
            break;
        case FIGURE_JANE_1:
            FiguresJane.figureScript((AbstractDriver) driverManager.getCurrentDriver());
            break;
        case RECTANGLE:
            complexCommandFactory.createRectangle(driverManager.getCurrentDriver()).execute();
            break;
        case CIRCLE:
            complexCommandFactory.createCircle(driverManager.getCurrentDriver(), circleRadius).execute();
        }
    }

}
