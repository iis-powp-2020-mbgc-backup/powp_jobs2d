package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.figures.FigureCommand;
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
		switch (figureType) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case FIGURE_JANE:
				FiguresJane.figureScript(new AbstractDriverAdapter(driverManager.getCurrentDriver()));
				break;
			case FIGURE_COMMAND:
				FigureCommand.figureScript(driverManager.getCurrentDriver());
			case FIGURE_COMPLEX_COMMAND:
				FigureCommand.figureScript2(driverManager.getCurrentDriver());
			default:
				break;
		}
	}
}
