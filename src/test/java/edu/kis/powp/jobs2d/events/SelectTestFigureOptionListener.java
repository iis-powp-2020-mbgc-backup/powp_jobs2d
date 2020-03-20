package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	public enum ScriptNumber {
		basic, special
	}
	private ScriptNumber scriptNumber;

	private DriverManager driverManager;
	private ScriptNumber script;

	public SelectTestFigureOptionListener(DriverManager driverManager, ScriptNumber num)
	{
		this.driverManager = driverManager;
		this.script = num;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (script.equals(ScriptNumber.basic))
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if (script.equals(ScriptNumber.special))
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());

	}
}
