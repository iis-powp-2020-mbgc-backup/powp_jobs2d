package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {
    public enum FigureType {
        FIGURE_JOE_1,
        FIGURE_JOE_2,
        RECTANGLE,
        CIRCLE
    }

    private DriverManager driverManager;
    private FigureType figureType;

    public SelectTestFigureOptionListener(DriverManager driverManager, FigureType figureType) {
        this.driverManager = driverManager;
        this.figureType = figureType;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (figureType) {
            case FIGURE_JOE_1:
                FiguresJoe.figureScript1(driverManager.getCurrentDriver());
                break;
            case FIGURE_JOE_2:
                FiguresJoe.figureScript2(driverManager.getCurrentDriver());
                break;
            case RECTANGLE:
                ComplexCommandFactory.rectangle(driverManager.getCurrentDriver(), -100, 0, 100, 200).execute();
                break;
            case CIRCLE:
                ComplexCommandFactory.circle(driverManager.getCurrentDriver(), -50, 50, 50).execute();
                break;
        }
    }
}
