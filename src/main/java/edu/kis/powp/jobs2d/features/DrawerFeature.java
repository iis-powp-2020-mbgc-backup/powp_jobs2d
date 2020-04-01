package edu.kis.powp.jobs2d.features;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.events.LineTypeListenerFactory;
import edu.kis.powp.jobs2d.events.SelectClearPanelOptionListener;
import edu.kis.legacy.drawer.panel.DrawPanelController;

public class DrawerFeature {

	private static DrawPanelController drawerController;

	/**
	 * Setup Drawer Plugin and add to application.
	 * 
	 * @param application Application context.
	 */
	public static void setupDrawerPlugin(Application application) {
		SelectClearPanelOptionListener selectClearPanelOptionListener = new SelectClearPanelOptionListener();
		LineTypeListenerFactory lineTypeListenerFactory = new LineTypeListenerFactory();
		
		drawerController = new DrawPanelController();
		application.addComponentMenu(DrawPanelController.class, "Draw Panel", 0);
		application.addComponentMenuElement(DrawPanelController.class, "Clear Panel", selectClearPanelOptionListener);
		application.addComponentMenuElement(DrawPanelController.class, "Basic line", lineTypeListenerFactory.getBasicLineTypeListener());
		application.addComponentMenuElement(DrawPanelController.class, "Dotted line", lineTypeListenerFactory.getDottedLineTypeListener());
		application.addComponentMenuElement(DrawPanelController.class, "Special line", lineTypeListenerFactory.getSpecialLineTypeListener());
		
		drawerController.initialize(application.getFreePanel());
	}

	/**
	 * Get controller of application drawing panel.
	 * 
	 * @return drawPanelController.
	 */
	public static DrawPanelController getDrawerController() {
		return drawerController;
	}
}
