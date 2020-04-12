package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureJoeOptionListener implements ActionListener {

    private DriverManager driverManager;
    private TestOption testOption;

    public SelectTestFigureJoeOptionListener(DriverManager driverManager, TestOption testOption) {
        this.driverManager = driverManager;
        this.testOption = testOption;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.testOption == TestOption.FIGURE_JOE1) {
            FiguresJoe.figureScript1(driverManager.getCurrentDriver());
        } else if (this.testOption == TestOption.FIGURE_JOE2) {
            FiguresJoe.figureScript2(driverManager.getCurrentDriver());
        } else if (this.testOption == TestOption.FIGURE_JANE) {
            FiguresJane.figureScript(new DriverAdapter(driverManager.getCurrentDriver()));
        }

    }
}
