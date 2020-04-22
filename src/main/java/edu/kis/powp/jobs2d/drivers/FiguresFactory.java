package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

import edu.kis.powp.command.DriverCommand;

public class FiguresFactory {
	
	public FiguresFactory() {
		figure = null;
	}
	
	public DriverCommand drawSquare(Job2dDriver driver) {
		figure = new SquareFigure(driver, 0, 0, 50);
		return figure.draw();
	}
	
	public DriverCommand drawRectangle(Job2dDriver driver) {
		figure = new RectangleFigure(driver, -100, -100, 50, 100);
		return figure.draw();
	}
	
	public DriverCommand drawCircle(Job2dDriver driver) {
		figure = new CircleFigure(driver, 100, 100, 50);
		return figure.draw();
	}
	
	private IFigure figure;
}
