package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * driver adapter to drawer with several bugs.
 */
//doesn't extend DrawPanelController, instead holds reference to it
public class DrawDriver implements Job2dDriver {

	//panel in which will this adapter draw
	private DrawPanelController dpc = null;

	private int startX = 0, startY = 0;

	public DrawDriver(DrawPanelController drawPanelController) {
		super();
		dpc = drawPanelController;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		//so next line starts when previous ends (next line's start position == this line's end position)
		setPosition(x, y);

		//drawLine(line);
		//don't draw line in yourself, draw line in given panel
		dpc.drawLine(line);
	}

	@Override
	public String toString() {
		return "DrawDriver (Job2dDriver -> DrawPanelController)";
	}
}
