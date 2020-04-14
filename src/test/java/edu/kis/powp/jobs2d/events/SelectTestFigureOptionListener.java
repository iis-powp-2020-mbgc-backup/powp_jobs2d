package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapterOfAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAdapter;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.features.FigureToDraw;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;
    private DriverCommand figureToDraw;

    public SelectTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public SelectTestFigureOptionListener(DriverManager driverManager, DriverCommand typeOfFigure) {
        this.figureToDraw = typeOfFigure;
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       figureToDraw.setDriver(driverManager.getCurrentDriver());
       figureToDraw.execute();
    }
}
