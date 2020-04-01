package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.FigureTypeEnum;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;
    private FigureTypeEnum figureTypeEnum;

    public SelectTestFigureOptionListener(DriverManager driverManager, FigureTypeEnum figureTypeEnum) {
        this.driverManager = driverManager;
        this.figureTypeEnum = figureTypeEnum;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (this.figureTypeEnum) {
            case FIG1:
                FiguresJoe.figureScript1(driverManager.getCurrentDriver());
                break;
            case FIG2:
                FiguresJoe.figureScript2(driverManager.getCurrentDriver());
                break;
            default:
                System.out.println("Something went wrong");
        }

    }
}
