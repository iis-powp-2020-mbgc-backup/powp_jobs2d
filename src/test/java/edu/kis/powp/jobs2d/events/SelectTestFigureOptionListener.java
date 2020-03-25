package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.DrawingType;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private DrawingType drawingType;

	public SelectTestFigureOptionListener(DriverManager driverManager, DrawingType drawingType) {
		this.driverManager = driverManager;
		this.drawingType = drawingType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (drawingType == DrawingType.FIGURE_1) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
