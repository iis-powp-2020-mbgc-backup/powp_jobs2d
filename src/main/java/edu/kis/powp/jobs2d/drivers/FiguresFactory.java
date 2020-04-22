package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

import edu.kis.powp.command.DriverCommand;

public class FiguresFactory {
	
	public FiguresFactory() {
		figure = null;
	}
	
	public DriverCommand drawSquare(Job2dDriver driver, int leftUpX, int leftUpY, int length) {
		figure = new SquareFigure(driver, leftUpX, leftUpY, length);
		return figure.draw();
	}
	
	public DriverCommand drawRectangle(Job2dDriver driver, int leftUpX, int leftUpY, int length, int height) {
		figure = new RectangleFigure(driver, leftUpX, leftUpY, length, height);
		return figure.draw();
	}
	
	public DriverCommand drawCircle(Job2dDriver driver, int circleCenterX, int circleCenterY, int radius) {
		figure = new CircleFigure(driver, circleCenterX, circleCenterY, radius);
		return figure.draw();
	}
	
	private IFigure figure;
}
