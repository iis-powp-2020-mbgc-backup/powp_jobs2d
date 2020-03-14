package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	private java.lang.reflect.Method method = null;

	private FiguresJoe obj = new FiguresJoe();

	public SelectTestFigureOptionListener(DriverManager driverManager, String figureScript) {
		this.driverManager = driverManager;
		try {
		  method = obj.getClass().getMethod(figureScript, (Job2dDriver.class));
		} catch (Exception e) { e.printStackTrace();}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    try {
	        method.invoke(obj, driverManager.getCurrentDriver());
	    } catch (Exception exc) { exc.printStackTrace();}
	}
}
