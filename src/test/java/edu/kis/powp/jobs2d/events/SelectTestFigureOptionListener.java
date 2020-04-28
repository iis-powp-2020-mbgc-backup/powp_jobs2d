package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.Command.RectangleFactory;
import edu.kis.powp.jobs2d.drivers.Command.SandglassFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private RectangleFactory rectangleFactory;
	private SandglassFactory sandglassFactory;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
		rectangleFactory = new RectangleFactory();
		sandglassFactory = new SandglassFactory();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().toLowerCase().equals("figure joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().toLowerCase().equals("figure joe 2")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		else if (e.getActionCommand().toLowerCase().equals("rectangle factory")) {
			//FiguresJoe.figureScript2(driverManager.getCurrentDriver());
			rectangleFactory.run(driverManager.getCurrentDriver());
		}
		else if (e.getActionCommand().toLowerCase().equals("sandglass factory")) {
			//FiguresJoe.figureScript2(driverManager.getCurrentDriver());
			sandglassFactory.run(driverManager.getCurrentDriver());
		}
	}
}
