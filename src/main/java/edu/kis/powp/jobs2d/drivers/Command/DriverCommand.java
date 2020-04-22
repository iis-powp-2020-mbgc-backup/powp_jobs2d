package edu.kis.powp.jobs2d.drivers.Command;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

public interface DriverCommand{

    void execute(Job2dDriver job2dDriver);

}
