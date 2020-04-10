package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;
    private Figure figureJoeToDraw;

    public SelectTestFigureOptionListener(DriverManager driverManager, Figure figure) {
        this.driverManager = driverManager;
        this.figureJoeToDraw = figure;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (figureJoeToDraw) {
        case FIGURE_JOE_1:
            FiguresJoe.figureScript1(driverManager.getCurrentDriver());
            break;
        case FIGURE_JOE_2:
            FiguresJoe.figureScript2(driverManager.getCurrentDriver());
            break;
        case FIGURE_JANE_1:
            FiguresJane.figureScript((AbstractDriver) driverManager.getCurrentDriver());
        }
    }

}
