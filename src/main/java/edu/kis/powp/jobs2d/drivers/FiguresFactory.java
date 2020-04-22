package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

import edu.kis.powp.command.DriverCommand;

public class FiguresFactory {
	
	public DriverCommand getSquare(Job2dDriver driver) {
		return new SquareFigure(driver, 0, 0, 50).get();
	}
	
	public DriverCommand getRectangle(Job2dDriver driver) {
		return new RectangleFigure(driver, 0, 0, 50, 100).get();
	}
}
