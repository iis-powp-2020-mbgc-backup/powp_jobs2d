package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;


public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	public enum ScriptNumber {
		scriptOne, scriptTwo
	}
	private ScriptNumber scriptNumber;

	public SelectTestFigureOptionListener(DriverManager driverManager, ScriptNumber scriptNumber) {
		this.driverManager = driverManager;
		this.scriptNumber = scriptNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(scriptNumber.equals(ScriptNumber.scriptOne))
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if(scriptNumber.equals(ScriptNumber.scriptTwo))
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}
