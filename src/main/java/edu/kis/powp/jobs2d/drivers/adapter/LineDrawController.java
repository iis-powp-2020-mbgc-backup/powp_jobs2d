package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * Driver adapter to drawer.
 */
public class LineDrawController implements Job2dDriver {
	private int startX = 0, startY = 0;
	private DrawPanelController drawPanelController;
	private ILine lineType;
	public LineDrawController(DrawPanelController drawPanelController, ILine lineType) {
		super();
		this.lineType = lineType;
		this.drawPanelController = drawPanelController;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		lineType.setStartCoordinates(this.startX, this.startY);
		lineType.setEndCoordinates(x, y);

		setPosition(x, y);
		drawPanelController.drawLine(lineType);
	}

	@Override
	public String toString() {
		return "Drawer adapter to Jobs2dMagic interface with " + lineType.toString() + "";
	}
}
