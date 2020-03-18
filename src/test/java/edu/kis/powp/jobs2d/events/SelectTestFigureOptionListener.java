package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Callable;

import edu.kis.powp.jobs2d.features.DrawerFeature;

public class SelectTestFigureOptionListener implements ActionListener {

	private Callable<Void> function;

	public SelectTestFigureOptionListener(Callable<Void> function) {
		this.function = function;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DrawerFeature.getDrawerController().clearPanel();
		try {
			function.call();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
