package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.FigureCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private Figure figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, Figure figure) {
		this.driverManager = driverManager;
		this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(this.figure){
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case FIGURE_COMMAND:
				FigureCommand.figureScript(driverManager.getCurrentDriver());
				break;
			case FIGURE_COMPLEX_TRIANGLE:
				FigureCommand.complexCommandSquareScript(driverManager.getCurrentDriver());
				break;
			default:
				System.out.println("Figure not exists");
		}
	}
}
