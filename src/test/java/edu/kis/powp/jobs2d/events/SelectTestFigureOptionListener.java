package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.FigureScripts;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    public enum FigureType {
        FIGURE_JOE_1,
        FIGURE_JOE_2,
        FIGURE_JANE,
        DIAMOND,
        ARROW,
        SQUARE,
        RANDOM_SQUARE
    }

    private DriverManager driverManager;
    private FigureType figureType;

    public SelectTestFigureOptionListener(DriverManager driverManager, FigureType figureType) {
        this.driverManager = driverManager;
        this.figureType = figureType;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();
        switch (figureType) {
            case FIGURE_JOE_1:
                FiguresJoe.figureScript1(currentDriver);
                break;
            case FIGURE_JOE_2:
                FiguresJoe.figureScript2(currentDriver);
                break;
            case FIGURE_JANE:
                FiguresJane.figureScript(new AbstractDriverAdapter(currentDriver));
                break;
            case DIAMOND:
                FigureScripts.figureScript(currentDriver);
                break;
            case ARROW:
                FigureScripts.figureScript2(currentDriver);
                break;
            case SQUARE:
                FigureScripts.figureScript3(currentDriver);
            case RANDOM_SQUARE:
                FigureScripts.figureScript4(currentDriver);
        }
    }
}
