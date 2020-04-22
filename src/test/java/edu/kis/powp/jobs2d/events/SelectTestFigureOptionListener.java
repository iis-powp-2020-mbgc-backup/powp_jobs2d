package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.CommandGenerator;
import edu.kis.powp.jobs2d.command.Factory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().toLowerCase().equals("figure joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().toLowerCase().equals("figure joe 2")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if (e.getActionCommand().equals("Figure Jane")) {
			FiguresJane.figureScript(new DriverAdapter(driverManager.getCurrentDriver()));
		}else if (e.getActionCommand().equals("Square")) {
			Factory.drawSquare(driverManager.getCurrentDriver(), 100).execute();
		}else if (e.getActionCommand().equals("Rectangle")) {
			Factory.drawRectangle(driverManager.getCurrentDriver(), 100).execute();
		}else if (e.getActionCommand().equals("Triangle")) {
			Factory.drawTriangle(driverManager.getCurrentDriver(), 100).execute();
		}else if (e.getActionCommand().equals("Figure Joe 1 C")) {
			CommandGenerator commandGenerator = new CommandGenerator(driverManager.getCurrentDriver());
			FiguresJoe.figureScript1(commandGenerator);
			commandGenerator.get().execute();
		}else if (e.getActionCommand().equals("Figure Joe 2 C")) {
			CommandGenerator commandGenerator = new CommandGenerator(driverManager.getCurrentDriver());
			FiguresJoe.figureScript2(commandGenerator);
			commandGenerator.get().execute();
		}
	}
}
