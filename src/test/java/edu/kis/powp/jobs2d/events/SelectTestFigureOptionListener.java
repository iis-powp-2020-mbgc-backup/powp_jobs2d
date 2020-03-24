package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private int testType;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
		this.testType = 1;
	}

	public SelectTestFigureOptionListener(DriverManager driverManager, int testType) {
		this.driverManager = driverManager;
		this.testType = testType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch(testType){
			case 1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case 2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			default:
				break;
		}
	}

	public static SelectTestFigureOptionListener getTest(DriverManager driverManager, int testType){
		return new SelectTestFigureOptionListener(driverManager, testType);
	}


}
