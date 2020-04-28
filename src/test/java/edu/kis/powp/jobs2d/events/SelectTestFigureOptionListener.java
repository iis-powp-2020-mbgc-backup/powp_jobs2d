package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drawings.DriverCommandsTestDrawing;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.factories.AbstractComplexCommandFactory;
import edu.kis.powp.jobs2d.factories.RectangleCommandFactory;
import edu.kis.powp.jobs2d.factories.TriangleCommandFactory;
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

		AbstractComplexCommandFactory factory;

		switch (figureType){
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JANE_1:
				FiguresJoe.figureScript1(new DriverAdapter(driverManager.getCurrentDriver()));
				break;
			case DRIVER_COMMANDS_TEST_FIGURE:
				DriverCommandsTestDrawing.figureScript(driverManager.getCurrentDriver());
				break;
			case RECTANGLE_COMPLEX_COMMAND:
				factory = new RectangleCommandFactory();
				factory.getComplexCommand().execute(driverManager.getCurrentDriver());
				break;
			case TRIANGLE_COMPLEX_COMMAND:
				factory = new TriangleCommandFactory();
				factory.getComplexCommand().execute(driverManager.getCurrentDriver());
				break;
		}
	}
}



