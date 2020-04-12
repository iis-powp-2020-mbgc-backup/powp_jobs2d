package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureJoeOptionListener implements ActionListener {

	private DriverManager driverManager;
	private TestCase testCase;
	public SelectTestFigureJoeOptionListener(DriverManager driverManager,TestCase testCase) {
		this.driverManager = driverManager;
		this.testCase = testCase;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.testCase == TestCase.FIGURE_JOE1){
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}else if (this.testCase == TestCase.FIGURE_JOE2){
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}

	}
}
