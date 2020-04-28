package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.CurrentDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private FigureType figureType;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureType figureType) {
		this.driverManager = driverManager;
		this.figureType = figureType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.figureType.equals(FigureType.FIGURE_JOE_1)) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if (this.figureType.equals(FigureType.FIGURE_JOE_2)) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if (this.figureType.equals(FigureType.JANE)) {
			FiguresJane.figureScript(new CurrentDriverAdapter(driverManager.getCurrentDriver()));
		}
//		else if (this.figureType.equals(FigureType.FIGURE_COMMAND)) {
//			FiguresJane.figureScript(new CurrentDriverAdapter(driverManager.getCurrentDriver()));
//		}
	}
}
