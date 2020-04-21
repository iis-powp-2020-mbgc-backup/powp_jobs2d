package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ShapeFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.JaneFiguresDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {
	
	private DriverManager driverManager;
	private TestFigure testFigure;

	public SelectTestFigureOptionListener(DriverManager driverManager, TestFigure testFigure) {
		this.driverManager = driverManager;
		this.testFigure = testFigure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (testFigure) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
				
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
				
			case FIGURE_JANE:
				FiguresJane.figureScript(new JaneFiguresDriver(driverManager.getCurrentDriver()));
				break;
				
			case TRIANGLE:
				ShapeFactory.createTriangle(200, driverManager.getCurrentDriver()).execute();
				break;
				
			case SQUARE:
				ShapeFactory.createSquare(200, driverManager.getCurrentDriver()).execute();
				break;
				
			case HEXAGON:
				ShapeFactory.createHexagon(100, driverManager.getCurrentDriver()).execute();
				break;
		}
	}
}
