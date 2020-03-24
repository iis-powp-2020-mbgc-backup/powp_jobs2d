package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private DriverFeature.Figure figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, DriverFeature.Figure figure) {
		this.driverManager = driverManager;
		this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figure) {
			case JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case JANE:
				FiguresJane.figureScript(new DriverAdapter(driverManager.getCurrentDriver()));
				break;
			default:
				break;
		}
	}
}
