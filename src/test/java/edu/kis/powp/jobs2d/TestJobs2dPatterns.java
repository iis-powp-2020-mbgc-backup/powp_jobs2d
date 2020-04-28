package edu.kis.powp.jobs2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.ExtentedLineFactory;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.SelectionableLineAdapter;
import edu.kis.powp.jobs2d.events.FigureType;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class TestJobs2dPatterns {
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param application Application context.
	 */
	private static void setupPresetTests(Application application) {
		application.addTest("Figure Joe 1", new SelectTestFigureOptionListener(DriverFeature.getDriverManager(), FigureType.FIGURE_JOE_1));
		application.addTest("Figure Joe 2", new SelectTestFigureOptionListener(DriverFeature.getDriverManager(), FigureType.FIGURE_JOE_2));
		application.addTest("Jane", new SelectTestFigureOptionListener(DriverFeature.getDriverManager(), FigureType.JANE));
//		application.addTest("Figure Command", new SelectTestFigureOptionListener(DriverFeature.getDriverManager(), FigureType.FIGURE_COMMAND));

	}

	/**
	 * Setup driver manager, and set default driver for application.
	 * 
	 * @param application Application context.
	 */
	private static void setupDrivers(Application application) {
		Job2dDriver loggerDriver = new LoggerDriver();
		DriverFeature.addDriver("Logger Driver", loggerDriver);
		DriverFeature.getDriverManager().setCurrentDriver(loggerDriver);

		Job2dDriver testDriverBasicLine = new LineDrawerAdapter(DrawerFeature.getDrawerController(), ExtentedLineFactory.getBasicLine());
		Job2dDriver testDriverSpecialLine = new LineDrawerAdapter(DrawerFeature.getDrawerController(), ExtentedLineFactory.getSpecialLine());
		Job2dDriver testDriverDottedLine = new LineDrawerAdapter(DrawerFeature.getDrawerController(), ExtentedLineFactory.getDottedLine());

		SelectionableLineAdapter selectionableLine = ExtentedLineFactory.getSelectionableLineAdapter();
		selectionableLine.setColor(Color.BLUE);

		Job2dDriver testDriverSelectionableLine = new LineDrawerAdapter(DrawerFeature.getDrawerController(), selectionableLine);

		DriverFeature.addDriver("BasicLine Simulator", testDriverBasicLine);
		DriverFeature.addDriver("SpecialLine Simulator", testDriverSpecialLine);
		DriverFeature.addDriver("DottedLine Simulator", testDriverDottedLine);
		DriverFeature.addDriver("SelectionableLine Simulator", testDriverSelectionableLine);

		DriverFeature.updateDriverInfo();
	}

	/**
	 * Setup menu for adjusting logging settings.
	 * 
	 * @param application Application context.
	 */
	private static void setupLogger(Application application) {
		application.addComponentMenu(Logger.class, "Logger", 0);
		application.addComponentMenuElement(Logger.class, "Clear log",
				(ActionEvent e) -> application.flushLoggerOutput());
		application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
		application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
		application.addComponentMenuElement(Logger.class, "Warning level",
				(ActionEvent e) -> logger.setLevel(Level.WARNING));
		application.addComponentMenuElement(Logger.class, "Severe level",
				(ActionEvent e) -> logger.setLevel(Level.SEVERE));
		application.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> logger.setLevel(Level.OFF));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Application app = new Application("2d jobs Visio");
				DrawerFeature.setupDrawerPlugin(app);

				DriverFeature.setupDriverPlugin(app);
				setupDrivers(app);
				setupPresetTests(app);
				setupLogger(app);

				app.setVisibility(true);
			}
		});
	}

}
