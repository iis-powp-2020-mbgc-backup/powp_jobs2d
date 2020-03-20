package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	public enum TestNumber{
		FiguresJoe1, FiguresJoe2
	}
	private TestNumber testNumber;
	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager, TestNumber testNumber) {
		this.driverManager = driverManager;
		this.testNumber = testNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(testNumber.equals(TestNumber.FiguresJoe1))
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if(testNumber.equals(TestNumber.FiguresJoe2))
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}
