package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapterOfAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAdapter;
import edu.kis.powp.jobs2d.features.FigureToDraw;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;
    private FigureToDraw figureToDraw;

    public SelectTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public SelectTestFigureOptionListener(DriverManager driverManager, FigureToDraw typeOfFigure) {
        this.figureToDraw = typeOfFigure;
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (figureToDraw) {

            case JOE_FIGURE_1:
                FiguresJoe.figureScript1(driverManager.getCurrentDriver());
                break;

            case JOE_FIGURE_2:
                FiguresJoe.figureScript2(driverManager.getCurrentDriver());
                break;

            case JANE_FIGURE:
                FiguresJane.figureScript(new DriverAdapterOfAdapter(0, 0, driverManager.getCurrentDriver()));
                break;
        }

    }
}
