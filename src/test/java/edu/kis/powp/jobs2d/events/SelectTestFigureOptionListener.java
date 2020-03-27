package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.TestFigureType;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private TestFigureType testFigureType;

	public SelectTestFigureOptionListener(DriverManager driverManager, TestFigureType type) {
		this.driverManager = driverManager;
		this.testFigureType = type;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (this.testFigureType) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(this.driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(this.driverManager.getCurrentDriver());
				break;
		}
	}
}
