package edu.kis.powp.jobs2d.features;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.events.SelectClearPanelOptionListener;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.events.SelectLineTypeOptionListener;

public class DrawerFeature {

	private static DrawPanelController drawerController;

	/**
	 * Setup Drawer Plugin and add to application.
	 * 
	 * @param application Application context.
	 */
	public static void setupDrawerPlugin(Application application) {
		SelectClearPanelOptionListener selectClearPanelOptionListener = new SelectClearPanelOptionListener();
		SelectLineTypeOptionListener selectLineTypeOptionListener = new SelectLineTypeOptionListener();

		drawerController = new DrawPanelController();
		application.addComponentMenu(DrawPanelController.class, "Draw Panel", 0);
		application.addComponentMenuElement(DrawPanelController.class, "Clear Panel", selectClearPanelOptionListener);
		application.addComponentMenuElement(DrawPanelController.class, "Basic", selectLineTypeOptionListener);
		application.addComponentMenuElement(DrawPanelController.class, "Dotted", selectLineTypeOptionListener);
		application.addComponentMenuElement(DrawPanelController.class, "Special", selectLineTypeOptionListener);

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
