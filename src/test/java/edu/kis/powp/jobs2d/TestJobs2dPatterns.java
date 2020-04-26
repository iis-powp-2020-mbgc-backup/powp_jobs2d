package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.command.CommandFactory;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.events.TestOption;
import edu.kis.powp.jobs2d.line.LineFactoryExtended;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureJoeOptionListener;
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
        SelectTestFigureJoeOptionListener selectFirstTestFigureOptionListener = new SelectTestFigureJoeOptionListener(
            DriverFeature.getDriverManager(), TestOption.FIGURE_JOE1);
        SelectTestFigureJoeOptionListener selectTestFigureJoe2OptionListener = new SelectTestFigureJoeOptionListener(
            DriverFeature.getDriverManager(), TestOption.FIGURE_JOE2);
        SelectTestFigureJoeOptionListener selectTestFigureJaneOptionListener = new SelectTestFigureJoeOptionListener(
            DriverFeature.getDriverManager(), TestOption.FIGURE_JANE);

        DriverCommand drawSquareCommand = CommandFactory.getSquareCommand();
        DriverCommand drawRectangleCommand = CommandFactory.getRectangleCommand();
        DriverCommand drawTrapeziumCommand = CommandFactory.getTrapeziumCommand();

        application.addTest("Figure Joe 1", selectFirstTestFigureOptionListener);
        application.addTest("Figure Joe 2", selectTestFigureJoe2OptionListener);
        application.addTest("Figure Jane", selectTestFigureJaneOptionListener);
        application.addTest("Square", actionEvent -> drawSquareCommand
            .execute(DriverFeature.getDriverManager().getCurrentDriver()));
        application.addTest("Rectangle", actionEvent -> drawRectangleCommand
            .execute(DriverFeature.getDriverManager().getCurrentDriver()));
        application.addTest("Trapezium", actionEvent -> drawTrapeziumCommand
            .execute(DriverFeature.getDriverManager().getCurrentDriver()));
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

        Job2dDriver testDriver = new DrawerAdapter(DrawerFeature.getDrawerController());
        DriverFeature.addDriver("Draw Simulator", testDriver);

        Job2dDriver basicLineDriver = new LineDrawerAdapter(LineFactory.getBasicLine(),
            DrawerFeature.getDrawerController());
        DriverFeature.addDriver("Basic Line", basicLineDriver);
        Job2dDriver specialLineDriver = new LineDrawerAdapter(LineFactory.getSpecialLine(),
            DrawerFeature.getDrawerController());
        DriverFeature.addDriver("Special Line", specialLineDriver);
        Job2dDriver dottedLineDriver = new LineDrawerAdapter(LineFactory.getDottedLine(),
            DrawerFeature.getDrawerController());
        DriverFeature.addDriver("Dotted Line", dottedLineDriver);
        Job2dDriver EditableLine = new LineDrawerAdapter(LineFactoryExtended.getEditAbleLine(),
            DrawerFeature.getDrawerController());
        DriverFeature.addDriver("Editable Line", EditableLine);

        DriverFeature.updateDriverInfo();
    }

    /**
     * Auxiliary routines to enable using Buggy Simulator.
     *
     * @param application Application context.
     */
    private static void setupDefaultDrawerVisibilityManagement(Application application) {
        DefaultDrawerFrame defaultDrawerWindow = DefaultDrawerFrame.getDefaultDrawerFrame();
        application.addComponentMenuElementWithCheckBox(DrawPanelController.class,
            "Default Drawer Visibility",
            new SelectChangeVisibleOptionListener(defaultDrawerWindow), true);
        defaultDrawerWindow.setVisible(true);
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
        application.addComponentMenuElement(Logger.class, "Fine level",
            (ActionEvent e) -> logger.setLevel(Level.FINE));
        application.addComponentMenuElement(Logger.class, "Info level",
            (ActionEvent e) -> logger.setLevel(Level.INFO));
        application.addComponentMenuElement(Logger.class, "Warning level",
            (ActionEvent e) -> logger.setLevel(Level.WARNING));
        application.addComponentMenuElement(Logger.class, "Severe level",
            (ActionEvent e) -> logger.setLevel(Level.SEVERE));
        application.addComponentMenuElement(Logger.class, "OFF logging",
            (ActionEvent e) -> logger.setLevel(Level.OFF));
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
