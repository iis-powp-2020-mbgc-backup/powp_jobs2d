package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.Jobs2dMagicToDrawerAdapter;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private DriverFeature.Feature feature;

	public SelectTestFigureOptionListener(DriverManager driverManager, DriverFeature.Feature feature) {
		this.driverManager = driverManager;
		this.feature = feature;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (feature) {
			case JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			default:
				break;
		}
	}
}
