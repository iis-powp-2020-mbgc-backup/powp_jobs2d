package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private FigureJoe figureToDraw;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureJoe figureJoe) {
		this.figureToDraw = figureJoe;
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figureToDraw) {
			case SHAPE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case SHAPE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
