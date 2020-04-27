package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.commands.CommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private CommandFactory commandFactory;
	public static final String FIGURE_JOE_1 = "Figure Joe 1";
	public static final String FIGURE_JOE_2 = "Figure Joe 2";
	public static final String FIGURE_JANE_1 = "Figure Jane 1";
	public static final String FIGURE_RECTANGLE = "Figure Rectangle";
	public static final String FIGURE_TRIANGLE = "Figure Triangle";
	public static final String FIGURE_DOUBLED_TRIANGLE = "Figure Doubled Triangle";

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
			case FIGURE_RECTANGLE:
				commandFactory.createRectangle(DriverFeature.getDriverManager().getCurrentDriver()).execute();
				break;
			case FIGURE_TRIANGLE:
				commandFactory.createTriangle(DriverFeature.getDriverManager().getCurrentDriver()).execute();
				break;
			case FIGURE_DOUBLED_TRIANGLE:
				commandFactory.createDoubledTriangle(DriverFeature.getDriverManager().getCurrentDriver()).execute();
				break;
			default:
				System.out.println("Bad decision");
		}
	}
}
