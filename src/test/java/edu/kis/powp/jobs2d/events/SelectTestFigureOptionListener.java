package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.ScriptType;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;



public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private ScriptType scriptType;

	public SelectTestFigureOptionListener(DriverManager driverManager, ScriptType scriptType) {
		this.driverManager = driverManager;
		this.scriptType = scriptType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(scriptType.equals(ScriptType.FIGURE_JOE_1)){
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else if(scriptType.equals(ScriptType.FIGURE_JOE_2)){
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
