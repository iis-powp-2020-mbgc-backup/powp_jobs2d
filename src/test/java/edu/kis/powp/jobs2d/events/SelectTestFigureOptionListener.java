package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private TestType testType;

	public SelectTestFigureOptionListener(DriverManager driverManager, TestType testType) {
		this.driverManager = driverManager;
		this.testType = testType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (testType){
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JANE_1:
				FiguresJoe.figureScript1(new DriverAdapter(driverManager.getCurrentDriver()));
				break;

		}
	}
}



