package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public enum FigureJoe {
		FIGURE_JOE1, FIGURE_JOE2
	}
	private FigureJoe figure;
	public SelectTestFigureOptionListener(DriverManager driverManager, FigureJoe figure) {
		this.driverManager = driverManager;
		this.figure=figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(figure.equals(FigureJoe.FIGURE_JOE1))
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		else if(figure.equals(FigureJoe.FIGURE_JOE2))
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}
}
