package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factories.Envelope;
import edu.kis.powp.jobs2d.factories.Envelope;
import edu.kis.powp.jobs2d.factories.RectangleFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;


public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private RectangleFactory recFactory;
	private Envelope postOffice;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
		this.recFactory = new RectangleFactory();
		this.postOffice = new Envelope();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.paramString().contains("Figure Joe 2"))
		{
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		else if (e.getActionCommand().toLowerCase().equals("rectangle factory")) {
			recFactory.run(driverManager.getCurrentDriver());
		}
		else if (e.getActionCommand().toLowerCase().equals("sandglass factory")) {
			postOffice.run(driverManager.getCurrentDriver());
		}
		else
		{
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
	}
}
