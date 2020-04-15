package edu.kis.powp.jobs2d;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineType;
import edu.kis.powp.jobs2d.events.SelectChangeVisibleOptionListener;
import edu.kis.powp.jobs2d.events.SelectTestFigureOptionListener;
import edu.kis.powp.jobs2d.factiories.FiguresFactory;
import edu.kis.powp.jobs2d.factiories.SpecialLineFactory;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.features.FigureToDraw;
import edu.kis.powp.jobs2d.shapes.Point;
import edu.kis.powp.jobs2d.shapes.scripts.basic.CircularPolygon;
import edu.kis.powp.jobs2d.shapes.scripts.basic.Rectangle;
import edu.kis.powp.jobs2d.shapes.scripts.basic.Triangle;

public class TestJobs2dPatterns {

    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Setup test concerning preset figures in context.
     *
     * @param application Application context.
     */
    private static void setupPresetTests(Application application) {
        SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener(DriverFeature.getDriverManager(),
                FiguresFactory.of(FigureToDraw.JOE_FIGURE_1));
        application.addTest("Figure Joe 1", selectTestFigureOptionListener);

        SelectTestFigureOptionListener figureJoe2Listener = new SelectTestFigureOptionListener(DriverFeature.getDriverManager(),
                FiguresFactory.of(FigureToDraw.JOE_FIGURE_2));
        application.addTest("Figure Joe 2", figureJoe2Listener);

        SelectTestFigureOptionListener figureJaneListener = new SelectTestFigureOptionListener(DriverFeature.getDriverManager(),
                FiguresFactory.of(FigureToDraw.JANE_FIGURE));
        application.addTest("Figure Jane", figureJaneListener);

        SelectTestFigureOptionListener defaultRectangleListener = new SelectTestFigureOptionListener(DriverFeature.getDriverManager(),
                FiguresFactory.of(FigureToDraw.RECTANGLE));
        application.addTest("Default rectangle", defaultRectangleListener);

        SelectTestFigureOptionListener defaultTriangleListener = new SelectTestFigureOptionListener(DriverFeature.getDriverManager(),
                FiguresFactory.of(FigureToDraw.TRIANGLE));
        application.addTest("Default triangle", defaultTriangleListener);

        SelectTestFigureOptionListener defaultCircularPolygonListener = new SelectTestFigureOptionListener(DriverFeature.getDriverManager(),
                FiguresFactory.of(FigureToDraw.CIRCULAR_POLYGON));
        application.addTest("Default circular polygon", defaultCircularPolygonListener);

        SelectTestFigureOptionListener customTriangleListener = new SelectTestFigureOptionListener(DriverFeature.getDriverManager(),
                Triangle.builder()
                        .havingVertexA(new Point(0, 90))
                        .havingVertexB(new Point(44, 160))
                        .havingVertexC(new Point(78, 23))
                        .build().script());
        application.addTest("Custom triangle", customTriangleListener);

        SelectTestFigureOptionListener customRectangleListener = new SelectTestFigureOptionListener(DriverFeature.getDriverManager(),
                Rectangle.builder()
                         .havingLeftTopCorner(new Point(23, 79))
                         .ofHeight(100)
                         .ofWidth(250)
                         .build().script());
        application.addTest("Custom rectangle", customRectangleListener);

        SelectTestFigureOptionListener customCircularPolygonListener = new SelectTestFigureOptionListener(DriverFeature.getDriverManager(),
                CircularPolygon.builder()
                               .havingCenterThere(new Point(33, 33))
                               .ofRadius(160)
                               .build().script());
        application.addTest("Custom circular polygon", customCircularPolygonListener);

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

        Job2dDriver testDriver = new Job2dDriverAdapter(DrawerFeature.getDrawerController(), SpecialLineFactory.of(LineType.BASIC));
        DriverFeature.addDriver("Buggy Simulator", testDriver);
        DriverFeature.addDriver("Basic line drawer adapter simulator",
                new LineDrawerAdapter(DrawerFeature.getDrawerController(),  SpecialLineFactory.of(LineType.BASIC)));
        DriverFeature.addDriver("Dotted line drawer adapter simulator",
                new LineDrawerAdapter(DrawerFeature.getDrawerController(),  SpecialLineFactory.of(LineType.DOTTED)));
        DriverFeature.addDriver("Special line drawer adapter simulator",
                new LineDrawerAdapter(DrawerFeature.getDrawerController(),  SpecialLineFactory.of(LineType.SPECIAL)));
        DriverFeature.addDriver("Modifiable line drawer adapter simulator",
                new LineDrawerAdapter(DrawerFeature.getDrawerController(),  SpecialLineFactory.of(LineType.WITH_OPTIONS)));
        DriverFeature.updateDriverInfo();
    }

    /**
     * Auxiliary routines to enable using Buggy Simulator.
     *
     * @param application Application context.
     */
    private static void setupDefaultDrawerVisibilityManagement(Application application) {
        DefaultDrawerFrame defaultDrawerWindow = DefaultDrawerFrame.getDefaultDrawerFrame();
        application.addComponentMenuElementWithCheckBox(DrawPanelController.class, "Default Drawer Visibility",
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
        application.addComponentMenuElement(Logger.class, "Clear log", (ActionEvent e) -> application.flushLoggerOutput());
        application.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> logger.setLevel(Level.FINE));
        application.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> logger.setLevel(Level.INFO));
        application.addComponentMenuElement(Logger.class, "Warning level", (ActionEvent e) -> logger.setLevel(Level.WARNING));
        application.addComponentMenuElement(Logger.class, "Severe level", (ActionEvent e) -> logger.setLevel(Level.SEVERE));
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
                //setupDefaultDrawerVisibilityManagement(app);
                DriverFeature.setupDriverPlugin(app);
                setupDrivers(app);
                setupPresetTests(app);
                setupLogger(app);

                app.setVisibility(true);
            }
        });
    }

}
