package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	public static final String FIGURE_JOE_1 = "Figure Joe 1";
	public static final String FIGURE_JOE_2 = "Figure Joe 2";
	public static final String FIGURE_JANE_1 = "Figure Jane 1";

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case FIGURE_JANE_1:
				DriverAdapter driverAdapter = new DriverAdapter(driverManager.getCurrentDriver());
				FiguresJane.figureScript(new DriverAdapter(driverAdapter));
				break;
			default:
				System.out.println("Bad decision");
		}
	}
}
