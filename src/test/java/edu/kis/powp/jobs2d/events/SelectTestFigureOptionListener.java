package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private int scriptNumber = 1;

	public SelectTestFigureOptionListener(DriverManager driverManager, int scriptNumber) {
		this.driverManager = driverManager;
		this.scriptNumber = scriptNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(scriptNumber){
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
}
