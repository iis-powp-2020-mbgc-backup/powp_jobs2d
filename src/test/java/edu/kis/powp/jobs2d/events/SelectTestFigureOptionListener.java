package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.CommandFactory;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommandBuilder;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private TestType testType;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
		this.testType = TestType.BOX;
	}

	public SelectTestFigureOptionListener(DriverManager driverManager, TestType testType) {
		this.driverManager = driverManager;
		this.testType = testType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch(testType){
			case BOX:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case RANDOM:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case RECTANGLE:
				CommandFactory.getRectangleCommand(driverManager.getCurrentDriver()).execute();
				break;
			case DIAMOND:
				CommandFactory.getDiamondCommand(driverManager.getCurrentDriver()).execute();
				break;
			default:
				break;
		}
	}

	public static SelectTestFigureOptionListener getTest(DriverManager driverManager, TestType testType){
		return new SelectTestFigureOptionListener(driverManager, testType);
	}


}
