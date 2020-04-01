package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class SpecialLineDrawerAdapter implements Job2dDriver{
	private DrawPanelController drawPanelController;
	private int startX = 0, startY = 0;
	public static LineType lineType = LineType.BASIC_LINE;
	
	public enum LineType {
		BASIC_LINE,
		DOTTED_LINE,
		SPECIAL_LINE
	}

	public SpecialLineDrawerAdapter() {
		super();
		drawPanelController = DrawerFeature.getDrawerController();
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = null;
		switch(lineType)
		{
			case BASIC_LINE:
			{
				line = LineFactory.getBasicLine();
				break;
			}
			case DOTTED_LINE:
			{
				line = LineFactory.getDottedLine();
				break;
			}
			case SPECIAL_LINE:
			{
				line = LineFactory.getSpecialLine();
				break;
			}
		}
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		setPosition(x, y);
		drawPanelController.drawLine(line);
	}
	
	public static void setLineType(LineType lineType) {
		SpecialLineDrawerAdapter.lineType = lineType;
	}
	
	@Override
	public String toString() {
		return "Special line simulator";
	}
}