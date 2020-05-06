package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.drivers.command.FactoryCommand;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Figure Joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}else if(e.getActionCommand().equals("Square")){
			FactoryCommand.square(DriverFeature.getDriverManager().getCurrentDriver(),30).execute();
		}else if(e.getActionCommand().equals("Rectangle")){
			FactoryCommand.rectangle(DriverFeature.getDriverManager().getCurrentDriver(),30, 50).execute();
		}else if(e.getActionCommand().equals("Triangle")){
			FactoryCommand.triangle(DriverFeature.getDriverManager().getCurrentDriver(),30).execute();
		}else{
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
