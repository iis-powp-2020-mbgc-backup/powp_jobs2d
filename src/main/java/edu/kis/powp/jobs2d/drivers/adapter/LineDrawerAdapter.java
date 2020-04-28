package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * driver adapter to drawer with several bugs.
 */
public class LineDrawerAdapter implements Job2dDriver {
	private int startX = 0, startY = 0;
	private DrawPanelController drawPanelController;
	private ILine line;

	public LineDrawerAdapter(ILine line) {
		super();
		this.line = line;
	}

	public LineDrawerAdapter(DrawPanelController drawPanelController, ILine line) {
		super();
		this.drawPanelController = drawPanelController;
		this.line = line;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		this.line.setStartCoordinates(this.startX, this.startY);
		this.line.setEndCoordinates(x, y);

		setPosition(x, y);
		this.drawPanelController.drawLine(this.line);
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
